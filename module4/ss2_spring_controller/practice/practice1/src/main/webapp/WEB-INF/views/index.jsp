<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/15/2022
  Time: 11:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Email Validation</title>
</head>
<body>
<h1>Email validate</h1>
<%--<h2>${mess}</h2>--%>

<form action="validate" method="post">
    <input type="text" name="email"><br>
    <button type="submit">Nhập</button>
</form>
</body>
</html>
