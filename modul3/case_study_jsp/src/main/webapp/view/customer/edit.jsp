<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/9/2022
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit Customer</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
<center>
    <h2>Edit Customer</h2>

</center>

    <form method="post">
        <table border="1px">
            <tr>
                <td>
                    <pre>Customer Type:</pre>
                </td>
                <td>
                    <select name="customerTypeId">
                        <option value="1">Diamond</option>
                        <option value="2">Platinium</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">Member</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>
                    <pre>Name:</pre>
                </td>
                <td><input type="text" name="name" value="${customer.name()}"></td>
            </tr>
            <tr>
                <td>
                    <pre>Birthday:</pre>
                </td>
                <td><input type="date" name="dateOfBirth" value="${customer.dateOfBirth()}" ></td>
            </tr>
            </tr>
            <tr>
                <td>
                    <pre>ID Card:  </pre>
                </td>
                <td><input type="text" name="idCard" value="${customer.idCard()}"></td>
            </tr>
            </tr>
            <tr>
                <td>
                    <pre>Gender:</pre>
                </td>
                <td><input type="radio" name="gender" value="true">Nam <input type="radio" value="false" name="gender"> Nữ</td>
            </tr>
            <tr>
                <td>
                    <pre>Phone Number:</pre>
                </td>
                <td><input type="text" name="phoneNumber" value="${customer.phoneNumber()}"></td>
            </tr>
            <tr>
                <td>
                    <pre>Email:</pre>
                </td>
                <td><input type="text" name="email" value="${customer.email()}"></td>
            </tr>
            <tr>
                <td>
                    <pre>Address:</pre>
                </td>
                <td><input type="text" name="address" value="${customer.address()}"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><input type="submit" value="edit"/></td>
            </tr>
        </table>
    </form>
    <a href="/customer">
        <button type="button">Back List Customer</button>
    </a>

</body>
</html>
