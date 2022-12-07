<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/3/2022
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
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
    <h2>Edit Customer</h2>
</center>

<center>
    <form  method="post" style="align-content: center" action="/customer?action=edit" >
        <input type="hidden" class="form-control" name="id" value="${customer.getId()}"></td>
        <div class="col-md-6">
            <label class="form-label">Customer Type</label>
                <select name="customerType" class="form-select">
                    <option value="1">1.Diamond</option>
                    <option value="2">2.Platinium</option>
                    <option value="3">3.Gold</option>
                    <option value="4">4.Silver</option>
                    <option value="5">5.Member</option>
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
            <c:if test="${mess != null}">
                <span style="color: darkred">${mess}</span>
            </c:if>
        </h2>
    </center>
    <a href="/customer">
        <button type="button">Back List Customer</button>
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
