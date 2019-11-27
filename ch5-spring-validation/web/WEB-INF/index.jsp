<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/13
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Validation</title>
</head>
<body>
    <form method="post" action="${pageContext.request.contextPath}/insert">
        <input type="text" name="id"/><br>
        <input type="text" name="name"/><br>
        <input type="text" name="phone"/><br>
        <input type="email" name="email"/><br>
        <input type="date" name="birthday"/><br>
        <input type="submit">
    </form>
</body>
</html>
