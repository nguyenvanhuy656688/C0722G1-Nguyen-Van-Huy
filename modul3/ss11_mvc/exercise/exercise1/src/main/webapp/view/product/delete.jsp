<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/24/2022
  Time: 2:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete Product</h1>
<form method="get" action="/product?action=delete&name=${product.getName()}" >
    <h3>Are you sure?</h3>
    <pre>Name:        ${product.getName()}</pre>
    <pre>Price:       ${product.getPrice()}</pre>
    <pre>Description: ${product.getDescription()}</pre>
    <pre>Manufacturer:${product.getManufacture()}</pre>
    <pre>             <button type="submit">Delete Product</button></pre>
    <pre>             <a href="/product">Back List Product</a></pre>
</form>
</body>
</html>
