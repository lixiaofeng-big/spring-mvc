<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/11
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <script src="${pageContext.request.contextPath}/file/jquery-3.4.1.js"></script>
</head>
<body>
    <h1>
        这里是 index 的jsp
    </h1>

  <form method="post" action="${pageContext.request.contextPath}/second/index">

      <input type="submit"/>
  </form>

</body>
</html>
