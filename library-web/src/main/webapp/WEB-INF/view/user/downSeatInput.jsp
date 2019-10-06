<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/6/4
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>确认入座</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/icon.css">
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" src="<%=request.getContextPath()%>/resources/js/jquery.easyui.min.js"></script>
</head>
<body>
    <div style="margin: auto">
        <div>欢迎:用户[${user.nickname}]使用座位预定系统</div><br>
        您选择的是楼层[${seat.roomNumber}], 座位号${seat.seatNumber}<br>
        <a id="btn" href="javascript:void(0)" style="text-align: center " onclick="addBook()">点击确认落座</a>


        <a href="index">点击返回主页</a>
   </div>
    <script>
        alert(window.localStorage);
        $("#btn").linkbutton({iconCls:'icon-add'});
        function addBook(){
            $.post("downSeat",
                {
                    seatNumber:${seat.seatNumber},
                    userId:${user.id},
                },
                function(data,status){
                    if(data==1){
                        alert("成功预定!!!");
                        window.location.href = "index";
                    }else{
                        alert("Data: " + data + "\nStatus: " + status);
                    }
                });
        }
// expire:1表示没有的过期,此座位不能预定
    </script>
</body>
</html>
