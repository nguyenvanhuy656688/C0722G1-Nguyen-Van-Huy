<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/14/2022
  Time: 3:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<table border="1">
    <caption>Customers List của: ${name}</caption>
    <thead>
    <tr><th>STT</th>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="customersList" items="${customersList}" varStatus="status">
        <tr>
            <td>${status.count}</td>
           <td>${customersList.getId()}</td>
           <td>${customersList.getName()}</td>
           <td>${customersList.getEmail()}</td>
           <td>${customersList.getAddress()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
