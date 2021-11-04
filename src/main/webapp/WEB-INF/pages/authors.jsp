<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Tarasii Lyzunyk
  Date: 11/4/2021
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>
</head>
<body>
<div>
    <ul>
        <c:forEach items="${authors}" var="author">
            <li>
                Name: <i>${author.name}</i><br>
                Surname: <i>${author.surname}</i><br>
                <br>
            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
