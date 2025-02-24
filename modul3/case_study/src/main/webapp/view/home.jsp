<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/3/2022
  Time: 1:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
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
<div class="row">
    <div class="col-md-4 col-lg-2">
        <ul class="list-group vh-100 " style="border: 2px solid #7952b3 ;background-color: #0dcaf0 ; height: 110%">
            <div class="row">
                <li><a class="dropdown-item" href="#"><img style="width: 100%" src="https://furamavietnam.com/wp-content/uploads/2018/03/Vietnam_Danang_Furama_Ocean-Studio-Suite-F-370x239.jpg" alt=""></a></li>
                <div class="col"><p style="text-align: center"><strong>Phòng nghỉ</strong></p></div>
            </div>
            <div class="row">
                <li><a class="dropdown-item" href="#"><img style="width: 100%" src="https://pix10.agoda.net/hotelImages/10953/-1/0e899b3e41830a0f7088b7b99c0d14cb.jpg?ca=9&ce=1&s=1024x768" alt=""></a></li>
                <div class="col"><p style="text-align: center"><strong>Phòng ăn</strong></p></div>
            </div>
            <div class="row">
                <li><a class="dropdown-item" href="#"><img style="width: 100%" src="https://furamavietnam.com/wp-content/uploads/2018/08/Vietnam_Danang_Furama_Villas_Beach_Pool_Villas_Pool-1047x563.jpg" alt=""></a></li>
                <div class="col"><p style="text-align: center"><strong>Bể bơi</strong></p></div>
            </div>
            <div class="row">
                <li><a class="dropdown-item" href="#"><img style="width: 100%" src=https://gamek.mediacdn.vn/133514250583805952/2020/4/9/12-15864246090451926057692.png></a></li>
                <div class="col"><p style="text-align: center"><strong>Girl áo tắm</strong></p></div>
            </div>
        </ul>
    </div>

    <div class="col-md-8 col-lg-10">
        <nav class="navbar navbar-expand-lg bg-light" ; style="background-color: #0dcaf0">
            <div id="carouselExampleControls" class="carousel slide" data-bs-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img  src="https://vtr.org.vn/FileManager/Anh%20web%202019/Thang%2010/2131/furama%20resort%20(2).jpg"
                              class="d-block w-100">
                    </div>
                    <div class="carousel-item active">
                        <img height="50%" src="https://phulong.com/UploadFiles/Images/FURAMA%2020%20NAM.jpg"
                             class="d-block w-100">
                    </div>
                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls"
                        data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls"
                        data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>
        </nav>
    </div>

</div>

<div style="margin-top: 30px "; class="footer">
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="col-md-6"; style="margin-left: 20px">

            <h4 style="font-weight: 700; color: #13653f;margin-top: 30px">Cơ sở</h4>
            <div class="p-2">1. Cố đô Huế - 123 Hàn Mạc Tử</div>
            <hr>
            <div class="p-2">2. Phố cổ Hội An - 569 Trần Phú</div>
            <hr>
            <div class="p-2">3. Thánh địa Mỹ sơn - 56 Trường Chinh</div>
            <hr>

        </div>

        <div class="col-md-6" style="margin-bottom: 300px">
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
</body>
</html>
