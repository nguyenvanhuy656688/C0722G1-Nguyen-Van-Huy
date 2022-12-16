<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/16/2022
  Time: 3:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<table border="1">
    <caption> List </caption>
    <thead>
    <tr><th>STT</th>
        <th>language</th>
        <th>Page Size</th>
        <th>spamsFilter</th>
        <th>signature</th>
        <th>Update</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="emailSettings" items="${emailSettings}" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${emailSettings.language}</td>
            <td>${emailSettings.pageSize}</td>
            <td>${emailSettings.spamsFilter}</td>
            <td>${emailSettings.signature}</td>
            <td><a href="/edit/${emailSettings.id}"><button>SỬa</button></a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
