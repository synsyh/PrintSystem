

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>首页</title>
<link rel="stylesheet" type="text/css" href="new-backstage/css/style_index.css" />
<script type="text/javascript" src="/new-backstage/js/jquery-1.6.min.js"> </script>
<script type="text/javascript" src="/new-backstage/js/index.js"></script>
</head>

<body>
<div class="nav-top">
	<span>在线打印系统</span>
    <div class="nav-topright">

        <span>您好：<%=session.getAttribute("username") %></span><span><a href="login.jsp">注销</a><%session.invalidate();%></span>
    </div>
</div>
<div class="nav-down">
	<div class="leftmenu1">
        <div class="menu-oc"><img src="/new-backstage/images/menu-all.png"></div>
    	<ul>
        	<li>
            	<a class="a_list a_list1">在线打印</a>
                <div class="menu_list menu_list_first">
                	<a class="lista_first" href="/stu_sys?name=upload">在线打印文档</a>
                    <a href="/stu_sys?name=score">查看打印队列</a>
                </div>
            </li>
            <li>
            	<a class="a_list a_list2">个人信息</a>
                <div class="menu_list">
                	<a href="/stu_sys?name=password">信用记录</a>
                    <a href="/stu_sys?name=stuinfo">查看信息</a>
                </div>
            </li>
        </ul>
    </div>
    <div class="leftmenu2">
    	<div class="menu-oc1"><img src="/new-backstage/images/menu-all.png"></div>
        <ul>
        	<li>
            	<a class="j_a_list j_a_list1"></a>
                <div class="j_menu_list j_menu_list_first">
                	<span class="sp1"><i></i>在线打印</span>
                	<a href="/stu_sys?name=upload">在线打印文档</a>
                    <a href="/stu_sys?name=allfile">查看打印队列</a>

                </div>
            </li>
            <li>
            	<a class="j_a_list j_a_list2"></a>
                <div class="j_menu_list">
                	<span class="sp2"><i></i>个人信息</span>
                	<a href="change_pwd.html">信用记录</a>
                    <a href="/stu_sys?name=stuinfo">查看信息</a>
                </div>
            </li>
        </ul>

    </div>
    <div class="rightcon">
    	<div class="right_con">
        	<p style="text-align:left; margin-top:50px">打印教程</p>
            <p style="text-align:left;margin-left: 80px">1、在线打印系统采用实名认证<br/>
                ２、 打印店有任何违反合约的行为将被撤销认证  <br/>
                3、  学生采用信用打印的方式 <br/>
                4、 违反规定将导致个人信用降低<br/>
                </p>
        </div>
    </div>
</div>
<div style="text-align:center;">

</div>

</body>
</html>

<script type="text/javascript">

</script>
