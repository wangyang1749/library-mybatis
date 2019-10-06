package com.syyb.common.util;

import org.apache.ibatis.executor.parameter.ParameterHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import java.util.Properties;

/**
 * type：表示拦截的对象
 * method：拦截的方法
 * args：拦截的参数
 */
@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class,Integer.class})})
public class PageInterceptor implements Interceptor {
    //每页显示的条目数
    private int pageSize;
    //当前现实的页数
    private int currPage;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        //获取对象
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        //利用mybatis的放射获取StatementHandler中的对象
        MetaObject MetaObjectHandler = SystemMetaObject.forObject(statementHandler);
        //获取MappedStatement，当前执行的接口名称
        MappedStatement mappedStatement = (MappedStatement) MetaObjectHandler.getValue("delegate.mappedStatement");
        String mapId = mappedStatement.getId();
        //拦截以.ByPage结尾的请求，分页功能的统一实现
        if (mapId.matches(".+ByPage$")) {
            //获取进行数据库操作时管理参数的handler
            ParameterHandler parameterHandler = (ParameterHandler) MetaObjectHandler.getValue("delegate.parameterHandler");
            //获取请求时的参数
            Map<String, Object> paraObject = (Map<String, Object>) parameterHandler.getParameterObject();
            //参数名称和在service中设置到map中的名称一致
            currPage = (int) paraObject.get("currPage");
            pageSize = (int) paraObject.get("pageSize");
            String sql = statementHandler.getBoundSql().getSql();
            String limitSql;
            sql = sql.trim();
            limitSql = sql + " limit " + (currPage - 1) * pageSize + "," + pageSize;
//            System.out.println("分页的sql："+limitSql);

            /**
             *
             */
            Connection connection = (Connection) invocation.getArgs()[0];
            String countSql="SELECT COUNT(0) from "+"("+sql+") a";

            PreparedStatement preparedStatement = connection.prepareStatement(countSql);
            //使用mybatis替换?
            parameterHandler.setParameters(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
            int count=0;
            while (resultSet.next()){
                count = resultSet.getInt(1);
            }
            resultSet.close();
            preparedStatement.close();
            paraObject.put("count",count);

            //将构建完成的分页sql语句赋值个体'delegate.boundSql.sql'，偷天换日
            MetaObjectHandler.setValue("delegate.boundSql.sql", limitSql);
        }

        //调用原对象的方法，进入责任链的下一级
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }
}
