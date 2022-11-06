<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/5/2022
  Time: 10:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Search Product</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>
<h1>Search Product Follow Name</h1>
<a href="/product">Back list</a>

<form action="/product?action=search" method="post">
    <pre>Name search:   <input type="text" name="name"></pre>
    <pre>               <button>Search</button></pre>
</form>

<table class="table">
    <thead>
    <tr>
        <th scope="col">Stt</th>
        <th scope="col">Name</th>
        <th scope="col">Proce</th>
        <th scope="col">Type</th>
        <th scope="col">Unit</th>
        <th scope="col">Size</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}">
        <tr>
            <c:forEach var="product" items="${products}">
                <th scope="row">${product.getId()}</th>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.Type()}</td>
                <td>${product.Unit()}</td>
                <td>${product.Size()}</td>
            </c:forEach>
        </tr>
    </c:forEach>

    </tbody>
</table>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</html>
Footer
© 2022 GitHub, Inc.
Footer navigation
Terms
