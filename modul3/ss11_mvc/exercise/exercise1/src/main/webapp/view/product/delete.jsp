<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/6/2022
  Time: 8:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
</head>
<body>
<h1>Delete Product</h1>
<a href="/product">Back list</a>

<form method="post">
    <h3>Are you sure?</h3>

    <pre>Name:        ${product.getName()}</pre>
    <pre>Price:       ${product.getPrice()}</pre>
    <pre>Description: ${product.getType()}</pre>
    <pre>Manufacturer:${product.getUnit()}</pre>
    <pre>Manufacturer:${product.getSize()}</pre>
    <pre>             <button>Delete Product</button></pre>
    <pre>             <a href="/product">Back List Product</a></pre>
</form>
</body>
</html>
