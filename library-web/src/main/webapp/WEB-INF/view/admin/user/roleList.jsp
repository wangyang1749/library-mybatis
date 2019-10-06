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
                url:"roleList?json",
                fitColumns:"true",
                singleSelect:"true",
                loadMsg:"数据加载成功！！！",
                pageList:[5,10,20],

                columns:[[
                    {field:'id',title:'角色id',width:100},
                    {field:'name',title:'角色名称',width:100},
                    {field:'operate',title:'操作', align:'center',width:$(this).width()*0.1,
                        formatter:function(value, row, index){
                            var str = '<a href="#" name="opera" class="easyui-linkbutton" >520</a>';
                            return str;
                        }
                    }


                ]],
                onLoadSuccess:function(data){
                    $("a[name='opera']").linkbutton({text:'下订单',plain:true,iconCls:'icon-add'});
                },
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
    <%--<thead>--%>
        <%--<tr>--%>
            <%--&lt;%&ndash;{"id":1,"name":"管理员","roleSn":null},&ndash;%&gt;--%>
                <%--<th field="ck" checkbox="true"></th>--%>
                <%--<th data-options="field:'id',width:100" >角色id</th>--%>
                <%--<th data-options="field:'name',width:100">角色名称</th>--%>
                <%--<th data-options="field:'roleSn',width:100,align:'right'">角色标识</th>--%>
                <%--<th data-options="field:'operate',width:100,align:'right'" >角色标识</th>--%>
        <%--</tr>--%>
    <%--</thead>--%>
</table>

</body>
</html>