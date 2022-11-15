<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/9/2022
  Time: 2:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>
<center>
    <h1>User Management</h1>
    <h2>
        <a href="/customer">List All Customer</a>
    </h2>
</center>

<form class="row" action="/customer?action=create" method="post">
    <div class="col-md-6">
        <label class="form-label">Name Customer</label>
        <input type="text" name="name" class="form-control" placeholder="Name Customer">
    </div>
    <div class="col-md-6">
        <label class="form-label">Day of Birth</label>
        <input type="date" name="dateOfBirth" class="form-control">
    </div>
    <div class="col-md-6">
        <label class="form-label">Customer Type</label>
        <select name="customerTypeId" class="form-select">
           <c:forEach var="customerType" items="${customerTypeList}" >
               <option value="${customerType.getId()}">${customerType.getCustomerName()}</option>
           </c:forEach>
        </select>
    </div>
    <div class="col-md-6">
        <label class="form-label">ID Card</label>
        <input type="text" name="idCard" class="form-control" placeholder="ID Card">
    </div>
    <div class="col-md-6">
        <label class="form-label">Phone Number</label>
        <input type="text" required pattern="[0][1-9][0-9]{8}" TITLE="Mời nhập lại!" name="phoneNumber" class="form-control" placeholder="Phone Number">
    </div>
    <div class="col-md-6">
        <label class="form-label">Address</label>
        <input type="text" name="address" class="form-control" placeholder="Address">
    </div>
    <div class="col-md-6">
        <label class="form-label">Email</label>
        <input type="email" name="email" class="form-control" placeholder="Email">
    </div>
    <div class="col-md-6">
        <label class="form-label">Gender</label>
        <br>
        <div class="form-check form-check-inline col-md-3">
            <label>
                <input type="radio" class="form-check-input"  value="true" name="gender" checked>
            </label>
            <label class="form-check-label">Male</label>
        </div>
        <div class="form-check form-check-inline col-md-3">
            <label>
                <input type="radio" class="form-check-input" value="false" name="gender">
            </label>
            <label class="form-check-label">Female</label>
        </div>
    </div>
    <div class="col-md-6">
        <br>
        <button class="btn btn-primary form-control">Save</button>
    </div>
</form>
</div>
<center>
    <h2>
        <c:if test="${message != null}">
            <span style="color: darkblue" class="alert-info">${message}</span>
        </c:if>
    </h2>
</center>
</body>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js"
        integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"
        integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13"
        crossorigin="anonymous"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
</html>
