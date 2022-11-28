<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/21/2022
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <style>
    .login {
      height:180px; width:230px;
      margin:0;
      padding:10px;
      border:1px #CCC solid;
    }
    .login input {
      padding:5px; margin:5px
    }
  </style>
  <body>
  <center>
  <form  method="post" action="/login">
    <div class="login">
        <h2>Chào mừng huycute đăng nhập</h2>
      <input type="text" name="username" size="30" placeholder = "Tên đăng nhập:">
      <input type="text" name="pass" size="30" placeholder ="Mật khẩu:">
      <input type="submit" value="login">
    </div>
  </form>
  </center>
  </body>
</html>
