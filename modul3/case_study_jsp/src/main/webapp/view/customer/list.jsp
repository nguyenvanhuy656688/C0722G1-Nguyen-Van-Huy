<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 11/9/2022
  Time: 2:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Furama</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>


</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light" style="background-color: #cff4fc">
    <div class="nav nav-item dropdown row" style="padding-left: 1%;word-spacing: 50px">
        <ul class="navbar-nav me-auto ">
            <li class="nav-item col-xl-3">
                <img src="https://furamavietnam.com/wp-content/uploads/2018/08/logo@2x.png" alt="">
                <a class="nav-link active" aria-current="page" href="https://furamavietnam.com/vi/"></a>
            </li>


            <li class="nav-item" style="padding-left: 50%;padding-top: 7%;margin-left: 50px ">
                <a href="#"><img src="https://smartdata.tonytemplates.com/bestel/wp-content/uploads/2018/05/widget-tripadvisor-logo.png" alt=""></a>
                <a href=""><div><img src="https://furamavietnam.com/wp-content/uploads/2018/08/widget-tripadvisor-rating.png" alt="">
                    <span class="form-control-color" style="font-size: 20px">2,746</span>
                    <span style="font-size: 20px;float: left" >view</span>
                </div></a>
            </li>
        </ul>
    </div>
    <div class="col-xl-2" style="margin-left: 20%">
        <div><p>
            <img src="https://png.pngtree.com/png-vector/20191118/ourlarge/pngtree-location-icon-creative-design-template-png-image_1998518.jpg"
                 width="30" height="30">
            103 – 105 Đường Võ Nguyên Giáp, Phường Khuê Mỹ, Quận Ngũ hành Sơn, Tp. Đà Nẵng, Việt Nam

            7.0 km từ Sân bay Quốc tế Đà Nẵng</p></div>
    </div>
    <div class="col-xl-4" style="margin-left: 10%">
        <div style="text-decoration: none">
            <ul STYLE="list-style: none">
                <li><p>
                    ☁SDT:84-236-3847 333/888</p></li>
                <li><a href="#"> <p >☁Email: reservation@furamavietnam.com</p></a></li>
            </ul>
        </div>
    </div>
</nav>
<nav class="navbar navbar-expand-lg bg-light">
    <div class=" container-fluid" style="background-color: #ffcd39;align-items: center">
        <a class="navbar-brand" href="view/home.jsp">Furama Home</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav" style="align-items: center">
                <li class="nav-item">
                    <div class="btn btn-group"><button type="button" class="btn btn-light nav-link">Quản lý</button>
                        <button type="button" class="btn btn-primary dropdown-toggle dropdown-toggle-split" data-bs-toggle="dropdown" aria-expanded="false">
                            <span class="visually-hidden">Toggle Dropdown</span>
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="/customer?action=customer">Khách hàng</a></li>
                            <li><a class="dropdown-item" href="http://localhost:63342/modul3/case_study_web/employer/employer.html?_ijt=hr37nimmgv70bd1e24cdgmvob4">Nhân viên</a></li>
                            <li><hr class="dropdown-divider"></li>
                        </ul></div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:63342/modul3/case_study_web/facility/info_facility.html?_ijt=fq0o9cog8uo49p2hptn9922rhh" style="font-weight: 700">Dịch vụ</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#" style="font-weight: 700">Hạ tầng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link "href="#"   style="font-weight: 700">Hợp đồng</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link "href="#"  style="font-weight: 700">Giải trí</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link "href="#"  style="font-weight: 700">Điểm đến</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
<section class="navbar d-flex justify-content-center" id="navbar">
    <div class="col-sm-12 col-md-11 ">
        <h2 style="text-align: center">Quản lý khách hàng</h2>
    </div>
    <%--Hiển Thị về Trang chủ --%>
    <div>
    <li class="list__item d-flex justify-content-center align-items-center"><button class="btn btn-secondary"><a href="/customer?action=customer">->Danh sách</a></button>
    </div>

    <div  class="wrapper h-100 d-flex nav-item" style="margin-left: 95px">
        <ul class="list d-flex text-bg-light">

           </li>
            <li class="list__item d-flex justify-content-center align-items-center font-monospace " style="font-size: 25px">
                <a href="/customer?action=create">Thêm khách hàng</a>
            </li>

        </ul>
        <div>
        <form action="/customer" method="get" style="display: flex;color: #0dcaf0" >
            <input type="hidden" name="action" value="search">
            <input class="form-control w-auto mx-2" type="text" placeholder="Search by ID..." name="IdSearch">
            <button class="btn btn-outline-success mx-2" type="submit" style="color: black"
                    style="margin-right: 0!important;">Search</button>
        </form></div>
    </div>
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
        <c:forEach var="customer" items="${customerList}" varStatus="status">
            <tr><td>${status.count}</td>
<%--                <td>${customer.getId()}</td>--%>
                <td>${customer.customerType.customerName}</td>
                <td>${customer.getName()}</td>
                <td>${customer.getDateOfBirth()}</td>
                <td>
                  <label> <c:if test="${customer.isGender()}">
                        Male</label>
                    <label></c:if>
                    <c:if test="${!customer.isGender()}">
                        Female
                    </c:if></label>
                </td>
                <td>${customer.getIdCard()}</td>
                <td>${customer.getPhoneNumber()}</td>
                <td>${customer.getEmail()}</td>
                <td>${customer.getAddress()}</td>

                <!-- Edit -->
                <td>
                    <a class="btn btn-success btn btn-sm" href="/customer?action=edit&id=${customer.getId()}">Edit</a>
                </td>
                <td>
                    <!-- Button trigger modal DELETE -->
                    <button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#sp${customer.getId()}">
                        Delete
                    </button>
                    <!-- Modal -->
                    <div class="modal fade " id="sp${customer.getId()}" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog ">
                            <div class="modal-content bg-white">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                </div>
                                <div class="modal-body" style="color: #000 ; text-decoration-color: white " >
                                    Bạn có muốn xóa <strong class="text-danger">${customer.getName()}</strong>
                                    không ?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
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
</section>
<div style="margin-top: 30px "; class="footer">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="col-md-4"; style="margin-left: 20px">
            <h1 style="color: #13653f ; margin-left: 40px">Hướng dẫn di chuyển</h1>
            <p style="margin-left: 40px">Khu nghỉ dưỡng Furama là cơ sở hàng đầu để khám phá một trong những điểm đến hấp dẫn nhất Châu Á. Chỉ
                cách Đà Nẵng một quãng lái xe ngắn là bốn Di sản Văn hóa Thế giới được UNESCO công nhận:</p>
            <button type="button" class="btn btn-lg btn-danger" data-bs-toggle="popover"
                    data-bs-title="Popover title"
                    data-bs-content="And here's some amazing content. It's very engaging. Right?"
                    style="margin-left: 50px">Xem trên bản đồ
            </button>
            <div class="d-flex flex-column mb-3" style="margin-left: 50px">
                <h4 style="font-weight: 700; color: #13653f;margin-top: 30px">Cơ sở</h4>
                <div class="p-2">1. Cố đô Huế - 123 Hàn Mạc Tử</div>
                <hr>
                <div class="p-2">2. Phố cổ Hội An - 569 Trần Phú</div>
                <hr>
                <div class="p-2">3. Thánh địa Mỹ sơn - 56 Trường Chinh</div>
                <hr>
            </div>
        </div>
        <div class="col-md-3">
            <ul style="margin-left: 70px; margin-bottom: 450px">
                <li>Giá công bố</li>
                <li>Lifestyle Blog</li>
                <li>Tuyển dụng</li>
                <li>Liên hệ</li>
            </ul>
        </div>
        <div class="col-md-4" style="margin-bottom: 300px">
            <img src="https://png.pngtree.com/png-vector/20191118/ourlarge/pngtree-location-icon-creative-design-template-png-image_1998518.jpg"
                 width="30" height="30">
            103 - 105 Vo Nguyen Giap Street, Khue My Ward, Ngu Hanh Son District, Danang City, Vietnam
            Tel.: 84-236-3847 333/888 * Fax: 84-236-3847 666
            Email: reservation@furamavietnam.com * www.furamavietnam.com GDS Codes: Amadeus-GD DADFUR,
            Galileo/Apollo-GD 16236, Sabre-GD 032771, Worldspan- GD DADFU
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
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
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
</body>
</html>


