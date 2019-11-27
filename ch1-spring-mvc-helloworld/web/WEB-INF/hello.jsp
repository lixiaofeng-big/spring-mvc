<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/7
  Time: 19:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>spring</title>
</head>
<body>
    这里是spring mvc的主要内容

<c:forEach items="${a}" var="e">
    ${e}
</c:forEach>
</body>
</html>
