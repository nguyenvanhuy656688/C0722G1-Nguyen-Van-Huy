<%--
  Created by IntelliJ IDEA.
  User: Huy Nguyen
  Date: 12/15/2022
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display</title>
</head>
<body>
<c:if test="${checkbox1!=null}">
    <p style="border: 1px solid black;width: 200px">+${checkbox1}</p>
</c:if>
<c:if test="${checkbox2!=null}">
    <p style="border: 1px solid black;width: 200px">+${checkbox2}</p>
</c:if>
<c:if test="${checkbox3!=null}">
    <p style="border: 1px solid black;width: 200px">+${checkbox3}</p>
</c:if>
<c:if test="${checkbox4!=null}">
    <p style="border: 1px solid black;width: 200px">+${checkbox4}</p>
</c:if>
</body>
</html>
