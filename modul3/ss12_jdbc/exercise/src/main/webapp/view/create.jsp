<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/2/2022
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<center>
<h1>Create</h1>
<form action="/user?action=create" method="post">
    <input type="hidden" name="action" value="create">
    <lable>User Name:</lable>
    <input type="text" name="name" placeholder="User name">
    <lable>User Email:</lable>
    <input type="text" name="email" placeholder="email">
    <lable>Country:</lable>
    <input type="text" name="country" placeholder="country">
    <button type="submit" value="create"></button>
</form>
</center>
</body>
</html>
