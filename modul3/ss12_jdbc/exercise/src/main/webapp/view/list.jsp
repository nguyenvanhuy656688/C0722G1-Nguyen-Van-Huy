<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/2/2022
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Users</h2></caption>
        <h2><form action="/users?action=search" method="post">
            <input type="hidden" name="action" value="search">
            <pre>Search:   <input type="text" name="country"></pre>
            <pre>          <button type="submit">Search</button></pre>
        </form></h2>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Country</th>
            <th>Actions</th>
        </tr>
        <c:forEach var="user" items="${listUser}">
            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a></td>

            <tr>
                <td><c:out value="${user.id}"/></td>
                <td><c:out value="${user.name}"/></td>
                <td><c:out value="${user.email}"/></td>
                <td><c:out value="${user.country}"/></td>
                <td>
                    <a href="/users?action=edit&id=${user.id}">Edit</a> </td>

                <td>
                    <!-- Button trigger modal DELETE -->
                    <button type="button" class="btn btn-danger" data-bs-toggle="modal"
                            data-bs-target="#sp${user.getId()}">
                        Delete
                    </button>
                    <!-- Modal -->
                    <div class="modal fade " id="sp${user.getId()}" tabindex="-1"
                         aria-labelledby="exampleModalLabel" aria-hidden="true">
                        <div class="modal-dialog ">
                            <div class="modal-content bg-white">
                                <div class="modal-header">
                                    <h5 class="modal-title" id="exampleModalLabel">Delete</h5>
                                    <button type="button" class="btn-close" data-bs-dismiss="modal"
                                            aria-label="Close"></button>
                                </div>
                                <div class="modal-body" style="color: #000 ; text-decoration-color: white ">
                                    Bạn có muốn xóa <strong class="text-danger">${user.getName()}</strong>
                                    không ?
                                </div>
                                <div class="modal-footer">
                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close
                                    </button>
                                    <a href="/user?action=delete&id=${user.getId()}" class="btn btn-danger">Delete</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
