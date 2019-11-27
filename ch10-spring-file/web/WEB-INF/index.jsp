<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 14:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath}/unload">
        <input type="file" name="myFile"/>
        <input type="submit" />
    </form>

    <br>

<%--
    <a href="${pageContext.request.context}/download?filename=1.jpg"> 下载(文件名有中文)</a>
--%>
   <%-- <a href="/download?filename=2.jpg"> 下载</a>--%>
    <img src="G:/Test/picture/2.jpg" rel="apple-touch-startup-image" width="200px"/>
</body>
</html>
