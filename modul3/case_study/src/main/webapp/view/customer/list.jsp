
<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/28/2022
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
            crossorigin="anonymous"></script>
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
<nav class="navbar navbar-expand-lg bg-light">
    <div class=" container-fluid" style="background-color: #ffcd39;align-items: center">
        <a class="navbar-brand" href="view/home.jsp">Furama Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav" style="align-items: center">
                <li class="nav-item">
                    <div class="btn btn-group">
                        <button type="button" class="btn btn-light nav-link">Quản lý</button>
                        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split"
                                data-bs-toggle="dropdown" aria-expanded="false">
                            <span class="visually-hidden">Toggle Dropdown</span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/customer?action=customer">Khách hàng</a></li>
                            <li><a class="dropdown-item" href="/employee?action=employee">Nhân viên</a></li>
                            <hr>
                        </ul>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link"
                       href="http://localhost:63342/modul3/case_study_web/facility/info_facility.html?_ijt=fq0o9cog8uo49p2hptn9922rhh"
                       style="font-weight: 700">Dịch vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/facility" style="font-weight: 700">Hạ tầng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link " href="#" style="font-weight: 700">Hợp đồng</a>
            </ul>
        </div>
    </div>
</nav>



<section class="navbar d-flex justify-content-center" id="navbar">
    <div class="col-sm-12 col-md-11 ">
        <h2 style="text-align: center">Quản lý khách hàng</h2>
    </div>
    <form action="/customer?action=customer" method="get">
        <input type="hidden" name="action" value="list">
        <button type="submit">Danh sách</button>
    </form>

    <div class="wrapper h-100 d-flex nav-item" style="margin-left: 95px">
        <div>
            <form action="/customer?action=create" >
                <input  type="hidden"  value="create" name="action">
                <button class="btn btn-outline-primary" type="submit">Thêm Mới</button>

            </form>
        </div>
        <div>
            <form action="/customer?action=search" method="get" style="display: flex;color: #0dcaf0">
                <input type="hidden" name="action" value="search">
                <input class="form-control w-auto mx-2" type="text" placeholder="Search by  Id..." name="id">
                <input class="form-control w-auto mx-2" type="text" placeholder="Search by  Name..."
                       name="name">
                <input class="form-control w-auto mx-2" type="text" placeholder="Search by Address..."
                       name="address">
                <button class="btn btn-outline-success mx-2" type="submit" style="color: black"
                        style="margin-right: 0!important;" >Search
                </button>
            </form>
        </div>
    </div>
</section>

<div>
    <table id="tableCustomer" class="table table-bordered" style="text-align: center" border="2">
        <thead style="background-color: yellow">
        <tr>
            <th>STT</th>
            <th>Customer Type</th>
            <th>Name</th>
            <th>Date of birth</th>
            <th>Gender</th>
            <th>ID Card</th>
            <th>Phone Number</th>
            <th>Email</th>
            <th>Address</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="customer" varStatus="status" items="${customerList}">
            <tr>
                <td>${status.count}</td>
                <td>${customer.customerType}</td>
                <td>${customer.name}</td>
                <td>${customer.dateOfBirth}</td>
                <td>
                    <label>
                        <c:if test="${customer.isGender()}">
                        Male</label>
                    <label></c:if>
                        <c:if test="${!customer.isGender()}">
                            Female
                        </c:if></label>
                </td>
                <td>${customer.idCard}</td>
                <td>${customer.phoneNumber}</td>
                <td>${customer.email}</td>
                <td>${customer.address}</td>

<%--                Edit--%>
                <td>
                    <a class="btn btn-success btn btn-sm"
                       href="/customer?action=edit&id=${customer.getId( )}">Edit</a>
                </td>
<%--                Delete--%>
                <td>
                    <!-- Button trigger modal DELETE -->
                    <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                            data-bs-target="#sp${customer.getId()}">
                        Delete
                    </button>
                    <!-- Modal -->
                    <div class="modal fade " id="sp${customer.getId()}" tabindex="-1"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog ">
                            <div class="modal-content bg-white">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body" style="color: #000 ; text-decoration-color: white ">
                                    Bạn có muốn xóa <strong class="text-danger">${customer.getName()}</strong>
                                    không ?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                    <a href="/customer?action=delete&id=${customer.getId()}" class="btn btn-danger">Delete</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="jquery/jquery-3.5.1.min.js"></script>
<script src="datatables/js/jquery.dataTables.min.js"></script>
<script src="datatables/js/dataTables.bootstrap5.min.js"></script>
<script style="align-content: center">
    $(document).ready(function () {
        $('#tableCustomer').dataTable({
            "dom": 'lrtip',
            "lengthChange": false,
            "pageLength": 5
        });
    });
</script>
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
