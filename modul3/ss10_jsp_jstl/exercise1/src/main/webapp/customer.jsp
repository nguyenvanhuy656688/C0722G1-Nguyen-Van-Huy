<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/3/2022
  Time: 2:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
<h1>List Customer</h1>
<table class="table" >
    <thead>
    <tr><th>STT</th>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th> Địa Chỉ</th>
        <th> Anh </th>
    </tr>
    </thead>

    <c:forEach items="${customers}" var="customer" varStatus="status">
        <tbody>
        <tr>
            <td>${status.count}</td>
            <td>${customer.getName()}</td>
            <td>${customer.getDayBirth()}</td>
            <td>${customer.getAddress()}</td>
            <td><img  src="${customer.getImage()}"></td>
        </tr>
        </tbody>
    </c:forEach>
</table>

</body>
</html>
