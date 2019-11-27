<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/14
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div id="data"></div>
    <script>
        $.ajax({
            url:"http://localhost:8080/web_war/test",
            method:"get",
            dataType:"json"
        }).done(function (res) {
            $("#data").append(res)
        })

    </script>
</body>
</html>
