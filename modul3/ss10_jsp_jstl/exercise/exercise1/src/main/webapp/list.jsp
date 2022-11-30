<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/30/2022
  Time: 1:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer List</title>
</head>
<body>
<table border="2">
    <thead>
    <tr>
        <th>STT</th>
        <th>Name</th>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customer" items="${customers}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${customer.name}</td>
            <td>${customer.dayBirth}</td>
            <td>${customer.address}</td>
            <td><img src="${customer.image}" alt="Anh girl"></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
