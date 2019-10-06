<%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/5/30
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>图书馆座位管理系统</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/bootstrap/dist/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/bower_components/Ionicons/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect. -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/dist/css/skins/skin-blue.min.css">



    </head>
<!--
BODY TAG OPTIONS:
=================
Apply one or more of the following classes to get the
desired effect
|---------------------------------------------------------|
| SKINS         | skin-blue                               |
|               | skin-black                              |
|               | skin-purple                             |
|               | skin-yellow                             |
|               | skin-red                                |
|               | skin-green                              |
|---------------------------------------------------------|
|LAYOUT OPTIONS | fixed                                   |
|               | layout-boxed                            |
|               | layout-top-nav                          |
|               | sidebar-collapse                        |
|               | sidebar-mini                            |
|---------------------------------------------------------|
-->
<body class="hold-transition skin-blue sidebar-mini">
<div class="wrapper">

    <!-- Main Header -->
    <%@include file="common/main-header.jsp"%>
    <!-- Left side column. contains the logo and sidebar -->
    <%@include file="common/main-sidebar.jsp"%>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">


        <%--<!-- Content Header (Page header) -->--%>
        <%--<section class="content-header">--%>
        <%--<h1>--%>
            <%--Page Header--%>
            <%--<small>Optional description</small>--%>
        <%--</h1>--%>
        <%--<ol class="breadcrumb">--%>
            <%--<li><a href="#"><i class="fa fa-dashboard"></i> Level</a></li>--%>
            <%--<li class="active">Here</li>--%>
        <%--</ol>--%>
    </section>

        <!-- Main content -->
        <section class="content container-fluid">

            <iframe src="userList" id="iframe-context-wrapper" name="iframe-context-wrapper" style="width: 100%; " frameborder="0" allowfullscreen>

            </iframe>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->

    <!-- Main Footer -->
    <%@include file="common/main-footer.jsp"%>

    <!-- Control Sidebar -->
    <%--<%@include file="common/control-sidebar.jsp"%>--%>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
    immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 3 -->
<script src="<%=request.getContextPath()%>/resources/bower_components/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="<%=request.getContextPath()%>/resources/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="<%=request.getContextPath()%>/resources/dist/js/adminlte.min.js"></script>
<script>
    var ifm= document.getElementById("iframe-context-wrapper");
    console.log(document.documentElement.clientHeight);
    ifm.height="800px";
</script>
<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>