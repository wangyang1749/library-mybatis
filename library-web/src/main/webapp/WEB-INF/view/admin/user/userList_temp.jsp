<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/5/30
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Client Side Pagination in TreeGrid - jQuery EasyUI Demo</title>
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/icon.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.easyui.min.js"></script>
    <script>
        $(function(){
            $('#tt').datagrid({
                title:'用户列表',
                method:"get",
                resizable:"true",
                pagination:"true",
                url:"userList?json",
                fitColumns:"true",
                singleSelect:"true",
                loadMsg:"数据加载成功！！！",
                pageList:[5,10,20],
                toolbar: [{
                    iconCls: 'icon-cut',

                    handler: function(){
                        var row = $('#tt').datagrid('getSelected');
                        if (row){
                            $.messager.confirm("警告",'你确定要删除这条记录？',function(r){
                                if (r){
                                    // alert();
                                    $.get("delUser?id="+row.id,function(data,status){
                                        // alert("Data: " + data + "\nStatus: " + status);
                                    });
                                    $('#tt').datagrid('reload');
                                }
                            });
                        }else{
                            $.messager.alert('error','请选择一条数据删除！！');
                        }
                    }
                    },'-',{
                    iconCls: 'icon-add',
                    handler: function(){
                        location.href="addUser";
                    }
                    },'-',{
                    iconCls: 'icon-edit',
                    handler: function(){
                        var row = $('#tt').datagrid('getSelected');
                            if (row){
                                location.href=row.id+"/update";
                                // $.messager.confirm("警告",'你确定要删除这条记录？',function(r){
                                //     if (r){
                                //
                                //     }
                                // });
                            }else{
                                $.messager.alert('error','请选择一条数据编辑！！');
                            }
                        }
                    },"-",{
                    iconCls: 'icon-search',
                        handler: function(){
                            alert("搜索！！");
                        }
                    }
                ]


            });
        });
    </script>
</head>
<body>

<table id="tt" class="easyui-datagrid" style="width:100% ">
    <thead>
        <tr>
            <%--{"id":1,"username":"张三","password":null,"sex":null,"email":null,"status":null,"collegename":"生物园","collegenameId":null,"classname":"生物能技术","classnameId":null,"ybId":null}--%>
                <th field="ck" checkbox="true"></th>
                <th data-options="field:'id',width:100" >id</th>
                <th data-options="field:'username',width:100">username</th>
                <th data-options="field:'collegename',width:100,align:'right'">collegename</th>
                <th data-options="field:'ybId',width:100,align:'right'" >ybId</th>
                <th data-options="field:'status',width:100,align:'right'">status</th>
                <th data-options="field:'id',width:100" >id</th>
        </tr>
    </thead>
</table>

<%--<div id="win" class="easyui-window" title="Login" closed="true"  style="width:300px;height:180px;">--%>
    <%--<form style="padding:10px 20px 10px 40px;">--%>
        <%--<p>Name: <input type="text"></p>--%>
        <%--<p>Pass: <input type="password"></p>--%>
        <%--<div style="padding:5px;text-align:center;">--%>
            <%--<a href="#" class="easyui-linkbutton" icon="icon-ok">Ok</a>--%>
            <%--<a href="#" class="easyui-linkbutton" icon="icon-cancel">Cancel</a>--%>
        <%--</div>--%>
    <%--</form>--%>
<%--</div>--%>
</body>
</html>