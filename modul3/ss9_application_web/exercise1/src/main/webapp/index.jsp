<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/2/2022
  Time: 1:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
  <title>Product Discount Calculator</title>
  </head>
<body>
<form method="post" action="/login">
  <div class="login">
    <h2>Calculator</h2>
    <label>List Price:</label>
    <input type="text" name="list_price"  placeholder="list_price" />
    <lable>Discount Percent:</lable>
    <input type="text" name="discount_percent"  placeholder="discount_percent" />
    <input type="submit" value="Tính tiền"/>
  </div>
</form>
</body>
</html>
