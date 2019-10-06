<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/6/2
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <!-- Bootstrap 3.3.7 -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/AdminLTE.min.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/icon.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.easyui.min.js"></script>
</head>
<body class="hold-transition login-page">
    <div class="login-box">
        <div class="login-logo">
            <a href="#">用户登录</a>
        </div>

        <div style="text-align: center">
            <a href="loginByYb?web"  class="btn btn-block btn-info">使用易班登录</a>
            <a href="loginByYb?web"  class="btn btn-block btn-info">使用二维码登录</a>

        </div>
        <div class="login-box-body">
            <p class="login-box-msg">登录到图书馆座位管理系统</p>
                <div >
                    <form id="ff" class="easyui-form" method="post" action="/admin" data-options="novalidate:true">
                        <table cellpadding="5">
                            <tr>
                                <td>用户名：</td>
                                <td><input class="easyui-textbox" prompt="username" type="text" name="username" data-options="required:true,missingMessage:'用户名不能为空！'"></input></td>
                            </tr>

                            <tr>
                                <td>密码</td>
                                <td><input  class="easyui-passwordbox" prompt="Password" iconWidth="28"  name="password" data-options="required:true,missingMessage:'用户密码不能为空！'"></input></td>
                            </tr>

                        </table>
                    </form>
                    <div style="padding:5px">
                        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">登录</a>
                    </div>
                 </div>

            <a href="#">忘记密码</a>
            <a href="#" class="text-center">注册新用户</a>

        </div>
    </div>

    <script>
        function submitForm(){
            $('#ff').form('submit',{
                url:"formLogin",
                onSubmit:function(){
                  return $(this).form('enableValidation').form('validate');
                },
                success:function(data){
                    if(data!="1"){
                        $.messager.alert('错误',data,"error");
                        // alert(data);
                        return;
                    }
                    location.href="admin";

                }
            });
        }
    </script>
</body>
</html>
