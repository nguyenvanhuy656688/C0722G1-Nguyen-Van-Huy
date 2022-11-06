<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/4/2022
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1>Management Product</h1>
<a href="/product?action=add">Add New</a>
<a href="/product?action=search">Search</a>
<table class="table">
    <thead>
    <tr>
        <th scope="col">Name</th>
        <th scope="col">Price</th>
        <th scope="col">Type</th>
        <th scope="col">Unit</th>
        <th scope="col">Size</th>
        <th scope="col">Edit</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${productList}">
        <tr>
            <th scope="row"><a href="/product?action=view&id=${product.getName()}">${product.getId()}</a></th>
            <td>${product.getPrice()}</td>
            <td>${product.getType()}</td>
            <td>${product.getUnit()}</td>
            <td>${product.getSize()}</td>
            <td><a href="/product?action=edit&id=${product.getName()}">Edit</a></td>
            <td><a href="/product?action=delete&id=${product.getName()}">Delete</a></td>
        </tr>
    </c:forEach>

    </tbody>

</table>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</html>
