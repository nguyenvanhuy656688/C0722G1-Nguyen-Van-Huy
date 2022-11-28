<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/21/2022
  Time: 11:10 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
 <h1>Convert Tiền</h1>
 <form action="/convert" method="post">
   <div>
     <lable>Rate:</lable>
     <input type="text" name="rate" size="30" placeholder="Nhập tỉ số chuyển đổi">
     <input type="text" name="usd" size="30" placeholder="Nhập usd">
     <input type="submit" value="convert" size="30">
   </div>
 </form>
  </body>
</html>
