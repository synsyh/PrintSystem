<%@page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>在线打印系统</title>
    <link rel="stylesheet" type="text/css" href="dist/css/bootstrap.css"/>
    <script src="https://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="dist/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-inverse" role="navigation">
    <div class="container-fluid">
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
    </div>
</nav>

</body>
</html>
