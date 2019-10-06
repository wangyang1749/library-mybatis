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
                title:'控制器列表',
                method:"get",
                resizable:"true",
                pagination:"true",
                url:"bookList?json",
                fitColumns:"true",
                singleSelect:"true",
                loadMsg:"数据加载成功！！！",
                pageList:[5,10,20],
            // {"id":7,"seatId":101,"userId":null,"occupyStatus":1,"stratTime":null,"endTime":null,"expire":1,"violation":null,"longTrem":null},
                columns:[[
                    {field:'abc',checkbox:"true",width:100,checkbox:"true"},
                    {field:'seatId',title:'seatId',width:100,},
                    {field:'userId',title:'userId',width:100,},
                    {field:'occupyStatus',title:'occupyStatus',width:100},
                    {field:'expire',title:'expire',width:100}
                ]],
                // onClickCell:function(rowIndex, field, value	){
                //     if(field=="seatNumber"){
                //         alert(value);
                //     }
                // },
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
                            var row = $('#tt').datagrid('getSelected');
                            if (row){
                                // alert(row.seatNumber);
                                $("#qrImg").attr("src", "http://localhost:8080/seatQr?sence=http://192.168.137.88:8080/addBookInput?seatNumber="+row.seatNumber);
                                $('#win').window({
                                    width:350,
                                    height:350,
                                    modal:true
                                });
                            }else{
                                $.messager.alert('error','请选择一条数据查看二维码！！');
                            }
                        }

                    }
                ]


            });
        });

    </script>
</head>
<body>
<table id="tt" class="easyui-datagrid" style="width:100% ">

</table>

<div id="win">
    <img id="qrImg" src=""/>
</div>
</body>
</html>