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
<div id="topNav">
    <a  class="easyui-linkbutton" href="/userList">用户列表</a>
    <a  class="easyui-linkbutton" href="/addUser">用户添加</a>
</div>
    <div class="easyui-panel" title="用户添加" style="width:100%">
        <div >
            <form id="ff" action="addUser" class="easyui-form" method="post" data-options="novalidate:true">
                <table cellpadding="5" style="margin: auto">
                    <tr>
                        <td>Name:</td>
                        <td><input class="easyui-textbox" type="text" name="name" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>Email:</td>
                        <td><input class="easyui-textbox" type="text" name="email" data-options="required:true,validType:'email'"></input></td>
                    </tr>
                    <tr>
                        <td>Subject:</td>
                        <td><input class="easyui-textbox" type="text" name="subject" data-options="required:true"></input></td>
                    </tr>
                    <tr>
                        <td>Message:</td>
                        <td><input class="easyui-textbox" name="message" data-options="multiline:true" style="height:60px"></input></td>
                    </tr>
                    <tr>
                        <td>Language:</td>
                        <td>
                            <select class="easyui-combobox" name="language"><option value="ar">Arabic</option><option value="bg">Bulgarian</option><option value="ca">Catalan</option><option value="zh-cht">Chinese Traditional</option><option value="cs">Czech</option><option value="da">Danish</option><option value="nl">Dutch</option><option value="en" selected="selected">English</option><option value="et">Estonian</option><option value="fi">Finnish</option><option value="fr">French</option><option value="de">German</option><option value="el">Greek</option><option value="ht">Haitian Creole</option><option value="he">Hebrew</option><option value="hi">Hindi</option><option value="mww">Hmong Daw</option><option value="hu">Hungarian</option><option value="id">Indonesian</option><option value="it">Italian</option><option value="ja">Japanese</option><option value="ko">Korean</option><option value="lv">Latvian</option><option value="lt">Lithuanian</option><option value="no">Norwegian</option><option value="fa">Persian</option><option value="pl">Polish</option><option value="pt">Portuguese</option><option value="ro">Romanian</option><option value="ru">Russian</option><option value="sk">Slovak</option><option value="sl">Slovenian</option><option value="es">Spanish</option><option value="sv">Swedish</option><option value="th">Thai</option><option value="tr">Turkish</option><option value="uk">Ukrainian</option><option value="vi">Vietnamese</option></select>
                        </td>
                    </tr>
                </table>
            </form>
            <div style="text-align:center;padding:5px">
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">Submit</a>
                <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">Clear</a>
            </div>

        </div>
    </div>
    <script>
        function submitForm(){
            $('#ff').form('submit',{
                onSubmit:function(){
                    var isValidate = $(this).form('enableValidation').form('validate');
                    if(isValidate){
                        location.href="userList1";
                        return true;
                    }else{
                        return false;
                    }

                }
            });
        }
        function clearForm(){
            $('#ff').form('clear');
        }
    </script>

</body>
</html>
