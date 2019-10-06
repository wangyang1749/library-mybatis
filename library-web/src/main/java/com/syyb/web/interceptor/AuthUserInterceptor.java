package com.syyb.web.interceptor;

import com.syyb.user.dto.UserDto;
import com.syyb.user.exception.UserException;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Set;

public class AuthUserInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        HandlerMethod hm = ((HandlerMethod) handler);
        UserDto user = (UserDto) request.getSession().getAttribute("user");
        if(user==null){
            String seatNumber = request.getParameter("seatNumber");
            response.sendRedirect(request.getContextPath()+"/loginByYb?param="+seatNumber);
            return false;
        }
////        if(user==null){
////            response.sendRedirect(request.getContextPath()+"/loginInput");
////        }else{
////            Set<String> urls = user.getUrls();
////            System.out.println("可访问的url"+urls);
////            String aName = hm.getBean().getClass().getName()+"."+hm.getMethod().getName();
////            System.out.println("当前的url为："+aName);
////            System.out.println(urls.contains(aName));
////            if(!urls.contains(aName)){
////                throw new UserException("您没有权限访问改功能！！！");
////            }
////        }
        System.out.println("user访问!!!!");
        return super.preHandle(request, response, handler);
    }
}
