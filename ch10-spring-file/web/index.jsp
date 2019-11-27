<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/20
  Time: 19:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="referrer" content="never">
    <title>Title</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/download?filename=a.jpg">下载试试</a>
<a href="${pageContext.request.contextPath}/download2?filename=a.jpg">下载试试2</a>
<img src="/File/a.jpg"  width="200px"/>
</body>
</html>
