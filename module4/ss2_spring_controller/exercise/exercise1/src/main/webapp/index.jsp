<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/15/2022
  Time: 3:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  <form action="/sandwich" method="post">
    <h1>Các thành phần của Sandwich</h1><br>
    <input type="checkbox" name="checkbox1" value="mật ong">Mật ong
    <input type="checkbox" name="checkbox2" value="đường">đường
    <input type="checkbox" name="checkbox3" value="Cà chua">Cà chua
    <input type="checkbox" name="checkbox4" value="bơ">bơ
    <button type="submit">Thêm</button>
  </form>
  </body>
</html>
</html>
