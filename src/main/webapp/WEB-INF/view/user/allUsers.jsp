<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All users</title>
</head>
<body>
<%@include file="../header.jsp" %>
<h2>Список читачів:</h2>
<table class="table table-hover table-bordered">
    <c:forEach items="${userModel}" var="user">
        <tr>
            <td>
                <fieldset>
                    <legend>${user.id}</legend>
                    <h3>
                        <a href="/user/${user.id}"> ${user.name} ${user.surname}</a>
                    </h3>
                </fieldset>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
