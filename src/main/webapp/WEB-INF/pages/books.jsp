<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div>
    <ul>
        <c:forEach items="${books}" var="author">
            <li>
                Name: <i>${author.title}</i><br>
                Taken count: <i>${author.takenCount}</i><br>
                Copies: <i>${author.copies}</i><br>
                Author details: <i>${author.author}</i><br>
                <br>
            </li>
        </c:forEach>
    </ul>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
