<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/7/2022
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Edit</title>
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




<center>
    <h1>Trang chỉnh sửa</h1>
    <h2>
        <a class="nav-link active" href="/facility">Quay lại danh sách</a>
    </h2>
</center>
<form method="post">
    <h1 class="text-center">Chỉnh sửa khách hàng</h1>
    <c:if test="${Facility != null}">
        <input type="hidden" name="id" value="${facility.getId()}"/>
    </c:if>

    <div class="row col-12">
        <div class="row col-6">
            <div class="form-group distance">
                <label for="name">Tên dịch vụ</label>
                <input type="text" class="form-control inputSize" id="name" name="name" value="${facility.getName()}">
            </div>
            <div class="form-group distance">
                <label for="area">Diện tích</label>
                <input type="text" class="form-control inputSize" id="area" name="area" value="${facility.getArea()}">
            </div>
            <div class="form-group distance">
                <label for="cost">Chi phí thuê</label>
                <input type="text" class="form-control inputSize" id="cost" name="cost" value="${facility.getCost()}">
            </div>
            <div class="form-group distance">
                <label for="max-people">Số người tối đa</label>
                <input type="text" class="form-control inputSize" id="max-people" name="max_people" value="${facility.getMaxPeople()}">
            </div>
            <div class="form-group distance">
                <label for="standard-room">Tiêu chuẩn phòng</label>
                <input type="text" class="form-control inputSize" id="standard-room" name="standard_room" value="${facility.getStandardRoom()}">
            </div>
        </div>
        <div class="row col-6">
            <div class="form-group distance">
                <label for="description-other-convenience">Mô tả tiện nghi</label>
                <input type="text" class="form-control inputSize" id="description-other-convenience" name="description_other_convenience" value="${facility.getDescriptionOther()}">
            </div>
            <div class="form-group distance">
                <label for="pool-area">Diện tích hồ bơi</label>
                <input type="text" class="form-control inputSize" id="pool-area"  name="pool_area" value="${facility.getPoolArea()}">
            </div>
            <div class="form-group distance">
                <label for="number-of-floor">Số tầng</label>
                <input type="text" class="form-control inputSize" id="number-of-floor"  name="number_of_floors" value="${facility.getNumberOfFloors()}">
            </div>
            <div class="form-group distance">
                <label for="facility-free">Dịch vụ miễn phí đi kèm</label>
                <input type="text" class="form-control inputSize" id="facility-free"  name="facility_free" value="${facility.getFacilityFree()}">
            </div>
            <div class="distance">
                <label class="form-label">Kiểu thuê</label>
                <select name="rent_type_id" class="form-control custom-select">

                    <option value="1">year</option>
                    <option value="2">month</option>
                    <option value="3">day</option>
                    <option value="4">hour</option>
                </select>
            </div>
            <div class="distance">
                <label class="form-label">Loại dịch vụ</label>
                <select name="facility_type_id" class="form-control custom-select">

                    <option value="1">villa</option>
                    <option value="2">house</option>
                    <option value="3">room</option>
                </select>
            </div>



            <button type="submit" class="btn btn-primary">Sửa</button>
        </div>
    </div>
</form>















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
