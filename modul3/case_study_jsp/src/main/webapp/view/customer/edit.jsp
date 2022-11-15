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

<center>
    <form  method="post" style="align-content: center">
    <div class="col-md-6">
        <label class="form-label">Customer Type</label>
        <select name="customerTypeId" class="form-select">--%>
            <c:forEach var="customerType" items="${customerTypeList}" >
                <option value="${customerType.getId()}">${customerType.getCustomerName()}</option>
            </c:forEach>
        </select>
    </div>
    <div class="col-md-6">
        <label class="form-label">Name:</label>
        <input type="text" class="form-control" name="name" value="${customer.getName()}"></td>
    </div>
    <div class="col-md-6">
        <label class="form-label">Birthday:</label>
        <input type="date" class="form-control" name="dateOfBirth" value="${customer.getDateOfBirth()}" ></td>
    </div>
    <div class="col-md-6">
        <label class="form-label">ID Card: </label>
        <input type="text" class="form-control" name="idCard" value="${customer.getIdCard()}">
    </div>
    <div class="col-md-6">
        <label class="form-label">Phone Number</label>
        <input type="text" name="phoneNumber" class="form-control" placeholder="Phone Number" value="${customer.getPhoneNumber()}">
    </div>
    <div class="col-md-6">
        <label class="form-label">Address</label>
        <input type="text" placeholder="Address" class="form-control" name="address" value="${customer.getAddress()}">
    </div>
    <div class="col-md-6">
        <label class="form-label">Email:</label>
        <input type="text" placeholder="Email" class="form-control" name="email" value="${customer.getEmail()}">
    </div>
    <div class="col-md-6">
        <label class="form-label">Gender</label>
        <br>
        <div class="form-check form-check-inline col-md-3" >
            <label><input class="form-check-input" type="radio" name="gender" ${customer.isGender()== true?"checked":""}>Male</label>
        </div>
        <div class="form-check form-check-inline col-md-3">
            <label><input class="form-check-input" type="radio"  name="gender" ${customer.isGender()== false?"checked":""}>Female</label>
        </div>
    </div>
    <div class="col-md-6">
        <br>
        <input type="submit" value="edit" class="btn btn-primary form-control">
    </div>
    </form>
    <center>
        <h2>
            <c:if test="${message != null}">
                <span style="color: darkred">${message}</span>
            </c:if>
        </h2>
    </center>
    <a href="/customer">
        <button type="button">Back List Customer</button>
    </a>
</center>

</body>
</html>
