<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/14/2022
  Time: 3:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Index</title>
  </head>
  <body>
  <Form action="/convert">
    <h1>Chuyển đổi tiền tệ </h1>
    <lable>Số tiền cần chuyển đổi</lable>
    <input type="number" name="money" >
    <lable>Đơn vị tiền cần chuyển đổi</lable>
    <select name="unit" >
      <option value="1">VND->ĐÔ LA</option>
      <option value="2">ĐÔ LA->VND</option>
    </select>
    <button type="submit" value="Tính">Tính </button>
  </Form>

  </body>
</html>
