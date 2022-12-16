<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/15/2022
  Time: 3:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<form action="/calculate" method="post">
    <lable for="1">Number 1</lable>
    <input id="1" type="number" name="number1" placeholder="Nhập số">
    <select name="calculate">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
    </select>
    <lable for="2">Number 2</lable>
    <input type="number" id="2" name="number2" placeholder="Nhập số">
    <button type="submit">Tính</button>
</form>
<h2>Result:${mess}</h2>
</body>
</html>
