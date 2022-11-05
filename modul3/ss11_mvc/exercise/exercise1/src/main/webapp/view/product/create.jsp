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
    <title>Title</title>
</head>
<body>
<h1>Add New Product</h1>
<a href="/product">Back list</a>

<c:if test="${message != null}">
    <span style="color: darkred">${message}</span>
</c:if>

<form action="/product?action=add" method="post">
    <pre>Name:          <input type="text" name="name"></pre>
    <pre>Price:        <input type="text" name="price"></pre>
    <pre>Type:       <input type="text" name="type"></pre>
    <pre>Unit: <input type="text" name="unit"></pre>
    <pre>Size:<input type="text" name="size"></pre>
    <pre>             <button>Save</button></pre>
</form>

</body>
</html>
