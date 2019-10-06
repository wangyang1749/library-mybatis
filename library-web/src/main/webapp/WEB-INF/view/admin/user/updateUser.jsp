<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/6/1
  Time: 18:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/easyui.css">
<%--<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/jquery-ui.min.css">--%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/icon.css">
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.easyui.min.js"></script>
<%--<script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-ui.min.js"></script>--%>


<body>
    <div class="easyui-panel" title="用户" style="width:100%">
        <div >

            <form id="ff"  class="easyui-form" method="post" data-options="novalidate:true">
                <input type="hidden" name="id" value="${updateUser.id}">
                <table cellpadding="5" style="margin: auto">
                    <tr>
                        <td>真实名称</td>
                        <td><input value="${updateUser.nickname}" disabled="disabled" class="easyui-textbox" type="text" name="username" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>用户头像</td>
                        <%--<input type="hidden" name="img">--%>
                        <td><img src="${updateUser.img}" width="50px"></td>

                    </tr>
                    <tr>
                        <td>用户名</td>
                        <td><input value="${updateUser.username}" class="easyui-textbox" type="text" name="username" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>用户密码</td>
                        <td>  <input class="easyui-passwordbox" prompt="Password" iconWidth="28" style="width:100%;height:34px;padding:10px" name="password" data-options="required:true"></td>
                    </tr>
                    <tr>
                        <td>学院</td>
                        <td><input value="${updateUser.collegename}" class="easyui-textbox" type="collegename" name="subject" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>班级</td>
                        <td><input value="${updateUser.classname}" class="easyui-textbox" type="classname" name="subject" data-options="required:true"></input></td>
                    </tr>
                </table>
            </form>
            <div style="text-align:center;padding:5px">
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">更新</a>
                <%--<a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>--%>
            </div>

        </div>
    </div>
    <script>
        function submitForm(){
            $('#ff').form('submit',{
                url:"update",
                onSubmit:function(){
                    return $(this).form('enableValidation').form('validate');
                },
                success:function(data){
                    if(data=="1"){
                        $.messager.alert('提示',"个人信息修改成功!!!","info");
                        return;
                    }
                }
            });
        }
    </script>

</body>
</html>
