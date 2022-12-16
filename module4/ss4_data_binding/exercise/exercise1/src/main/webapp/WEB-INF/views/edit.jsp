<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/16/2022
  Time: 3:44 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/edit_new" method="post" modelAttribute="emailSetting">
    <h1>Settings</h1>
    <form:hidden path="id" />
    <form:label path="language">Language</form:label>
    <form:select path="language" items="${emailSettings}"/>
    <form:label path="pageSize">Size</form:label>
    <form:select path="pageSize" items="${sizeList}"/>
    <form:label path="spamsFilter">Spams filter</form:label>
    <form:checkbox path="spamsFilter"/>
    <form:label path="signature">Signature</form:label>
    <form:textarea path="signature"/>
    <span><button type="submit">Chỉnh sửa</button></span>
    <span><button type="button">close</button></span>
</form:form>
</body>
</html>
