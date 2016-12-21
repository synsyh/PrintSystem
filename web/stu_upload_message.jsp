<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="en">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>文件上传结果</title>
    <link rel="stylesheet" href="dist/css/bootstrap.css">
    <script src="dist/js/jquery-3.1.1.min.js"></script>
    <script>
        function redirect() {
            location.assign("pay.html");
        }
    </script>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-lg-12 text-center">
            <label>颜色：<%=session.getAttribute("color")%>
            </label>
            <br/>
            <label>纸张大小：<%=session.getAttribute("size")%>
            </label>
            <br/>
            <label>打印份数：<%=session.getAttribute("printnum")%>
            </label>
            <p>${message}<a href="preview.jsp">在线预览文件</a></p>
            <button class="btn btn-default" onclick="redirect()">确认</button>
        </div>
    </div>
</div>
</body>
</html>