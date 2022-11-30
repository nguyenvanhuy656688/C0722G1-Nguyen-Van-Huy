<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/30/2022
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <form action="/calculator" method="post">
    <lable>firstOperand</lable>
    <input type="text" placeholder="firstOperand" name="firstOperand">

    <lable>operator</lable>
    <select name="operator">
      <option value="+">Addition</option>
      <option value="-">Subtraction</option>
      <option value="*">Multiplication</option>
      <option value="/">Division</option>
    </select>
    <lable>secondOperand</lable>
    <input type="text" placeholder="secondOperand" name="secondOperand">
    <td><input type="submit" value="Calculate"/></td>
  </form>
  </body>
</html>
