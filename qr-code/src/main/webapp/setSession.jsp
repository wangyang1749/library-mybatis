<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/5/22
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>setSession</h1>
<%request.getSession().setAttribute("user","张三");%>
</body>
</html>
