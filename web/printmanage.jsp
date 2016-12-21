<%--
  Created by IntelliJ IDEA.
  User: sunning
  Date: 16-12-21
  Time: 下午10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>打印管理</title>
    <link rel="stylesheet" type="text/css" href="dist/css/bootstrap.css"/>
    <script src="dist//jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container-fluid">
    <nav class="navbar navbar-inverse" role="navigation">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">打印店后台管理</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="/newsServlet?t=<%=Math.random()%>>">发布信息</a></li>
                <li><a href="#">查看店铺信息</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        打印管理 <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li><a href="#">已打印的文档</a></li>
                        <li><a href="#">未打印的文档</a></li>
                        <li><a href="#">全部文档</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <div class="row">
        <div class="col-lg-12">

        </div>
    </div>
</div>
</body>
</html>

