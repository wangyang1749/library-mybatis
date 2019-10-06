<%@ page import="com.syyb.user.dto.UserDto" %><%--
  Created by IntelliJ IDEA.
  User: wangyang
  Date: 2019/5/16
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="${user.img}" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
                <p>${user.nickname}</p>
                <a href="#"><i class="fa fa-circle text-success"></i> 在线</a>
            </div>
        </div>


        <!-- search form -->
        <form action="#" method="get" class="sidebar-form">
            <div class="input-group">
                <input type="text" name="q" class="form-control" placeholder="Search...">
                <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
            </div>
        </form>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu" data-widget="tree">
            <li class="header">主要导航</li>


            <li class=" treeview">
                <a href="#">
                    <i class="fa fa-user"></i> <span>用户管理</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu">
                    <li class="active"><a href="userList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 用户信息管理</a></li>
                    <li><a href="/roleList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 用户角色管理</a></li>
                    <%--<li><a href="userList1" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 用户组理</a></li>--%>
                </ul>
            </li>

            <li class=" treeview">
                <a href="#">
                    <i class="fa fa-bank "></i> <span>座位预定管理</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu">
                    <li class="active"><a href="seatList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 座位信息管理</a></li>
                    <li><a href="bookList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 座位预约管理 </a></li>
                    <li><a href="userList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 座位统计</a></li>
                </ul>
            </li>


            <li class=" treeview">
                <a href="#">
                    <i class="fa  fa-asterisk"></i> <span>系统设置</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu">
                    <li class="active"><a href="urlList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i> 菜单资源</a></li>
                    <li><a href="urlList" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i>控制器资源 </a></li>
                    <li><a href="jobManager" target="iframe-context-wrapper"><i class="fa fa-circle-o"></i>任务调度</a></li>
                </ul>
            </li>


           </ul>
    </section>
    <!-- /.sidebar -->
</aside>
