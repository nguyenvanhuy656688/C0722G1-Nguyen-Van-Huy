<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/7/2022
  Time: 9:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #cff4fc">
    <div class="nav nav-item dropdown row" style="padding-left: 1%;word-spacing: 50px">
        <ul class="navbar-nav me-auto ">
            <li class="nav-item col-xl-3">
                <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo@2x.png" alt="">
                <a class="nav-link active" aria-current="page" href="https://furamavietnam.com/vi/"></a>
            </li>


            <li class="nav-item col-xl-3" style="padding-left: 50%;padding-top: 7%;margin-left: 50px ">
                <a href="#"><img
                        src="https://smartdata.tonytemplates.com/bestel/wp-content/uploads/2018/05/widget-tripadvisor-logo.png"
                        alt=""></a>
                <a href="">
                    <div><img src="https://furamavietnam.com/wp-content/uploads/2018/08/widget-tripadvisor-rating.png"
                              alt="">
                        <span class="form-control-color" style="font-size: 20px">2,746</span>
                        <span style="font-size: 20px;float: left">view</span>
                    </div>
                </a>
            </li>
        </ul>
    </div>
</nav>




<center>
    <h2>Edit Employee</h2>
</center>

<center>
    <form  method="post" style="align-content: center" action="/employee?action=edit" >
        <input type="hidden" class="form-control" name="id" value="${employee.getId()}"></td>
        <div class="col-md-6">
            <label class="form-label">Name:</label>
            <input type="text" class="form-control" name="name" value="${employee.getName()}"></td>
        </div>
        <div class="col-md-6">
            <label class="form-label">Birthday:</label>
            <input type="text" class="form-control" name="dateOfBirth" value="${employee.getDateOfBirth()}" ></td>
        </div>
        <div class="col-md-6">
            <label class="form-label">ID Card: </label>
            <input type="text" class="form-control" name="idCard" value="${employee.getIdCard()}">
        </div>
        <div class="col-md-6">
            <label class="form-label">Salary</label>
            <input type="text" name="salary" class="form-control" placeholder="Salary" value="${employee.getSalary()}">
        </div>
        <div class="col-md-6">
            <label class="form-label">Phone Number</label>
            <input type="text" name="phoneNumber" class="form-control" placeholder="Phone Number" value="${employee.getPhoneNumber()}">
        </div>
        <div class="col-md-6">
            <label class="form-label">Email:</label>
            <input type="text" placeholder="Email" class="form-control" name="email" value="${employee.getEmail()}">
        </div>
        <div class="col-md-6">
            <label class="form-label">Address:</label>
            <input type="text" placeholder="Address" class="form-control" name="address" value="${employee.getAddress()}">
        </div>
        <div class="col-md-6">
            <label class="form-label">Position</label>
            <select name="position" class="form-select">
                <option value="1">1.Quản lý</option>
                <option value="2">2.Nhân viên</option>
            </select>
        </div>
        <div class="col-md-6">
            <label class="form-label">EducationDegreeId</label>
            <select name="educationDegreeId" class="form-select">
                <option value="1">1.Trung Cấp</option>
                <option value="2">2.Cao Đẳng</option>
                <option value="3">2.Đại Học</option>
                <option value="4">2.Sau Đại Học</option>
            </select>
        </div>
        <div class="col-md-6">
            <label class="form-label">Division</label>
            <select name="division" class="form-select">
                <option value="1">1.Sale-Marketing</option>
                <option value="2">2.Hành Chính</option>
                <option value="3">2.Phục Vụ</option>
                <option value="4">2.Quản Lý</option>
            </select>
        </div>
        <div class="col-md-6">
            <label class="form-label">Username</label>
            <select name="username" class="form-select">
                <option value="1">1.nhanvien1</option>
                <option value="2">2.nhanvien2</option>
                <option value="3">2.nhanvien3</option>
                <option value="4">2.nhanvien4</option>
                <option value="5">2.nhanvien5</option>
            </select>
        </div>
        <div class="col-md-6">
            <br>
            <input type="submit" value="edit" class="btn btn-primary form-control">
        </div>
    </form>
    <center>
        <h2>
            <c:if test="${mess5 != null}">
                <span style="color: darkred">${mess5}</span>
            </c:if>
        </h2>
    </center>
    <a href="/employee">
        <button type="button">Back List Employee</button>
    </a>
</center>



<div style="margin-top: 30px " ; class="footer">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="col-md-6" ; style="margin-left: 20px">
            <div class="d-flex flex-column mb-3" style="margin-left: 50px">
                <h4 style="font-weight: 700; color: #13653f">Cơ sở</h4>
                <div class="p-2">1. Cố đô Huế - 123 Hàn Mạc Tử</div>
                <hr>
                <div class="p-2">2. Phố cổ Hội An - 569 Trần Phú</div>
                <hr>
                <div class="p-2">3. Thánh địa Mỹ sơn - 56 Trường Chinh</div>
                <hr>
            </div>
        </div>

        <div class="col-md-6" style="margin-bottom: 300px">
            <img src="https://png.pngtree.com/png-vector/20191118/ourlarge/pngtree-location-icon-creative-design-template-png-image_1998518.jpg"
                 width="30" height="30">
            103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam
            Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666
            Email: reservation@furamavietnam.com
            <hr>
            <div>
                <img src="https://sugarbeeapple.com/wp-content/uploads/2021/08/facebook-icon-1.png" ;
                     style="width: 30px;height: 30px">
                <img src="https://cdn-icons-png.flaticon.com/512/152/152810.png" ;
                     style="width: 40px; height: 40px">
                <img src="https://cdn.icon-icons.com/icons2/2973/PNG/512/instagram_logo_icon_186929.png" ;
                     style="width: 30px;height: 30px">
            </div>
        </div>
    </nav>
</div>

</body>
</html>
