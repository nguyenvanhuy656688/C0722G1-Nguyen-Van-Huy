<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/4/2022
  Time: 5:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<h1>Edit Product</h1>
<a href="/product">Back list</a>

<c:if test="${message != null}">
    <span style="color: blue">${message}</span>
</c:if>

<form method="post">
    <pre>Name:        <input type="text" name="name" value="${product.getName()}"></pre>
    <pre>Price:       <input type="text" name="price" value="${product.getPrice()}"></pre>
    <pre>Description: <input type="text" name="description" value="${product.getType()}"></pre>
    <pre>Manufacturer:<input type="text" name="manufacturer" value="${product.Unit()}"></pre>
    <pre>Manufacturer:<input type="text" name="manufacturer" value="${product.Size()}"></pre>
    <pre>             <button>Edit Product</button></pre>
</form>
</html>
