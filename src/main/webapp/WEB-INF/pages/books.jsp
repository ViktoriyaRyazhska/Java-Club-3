<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<div>
    <ul>
        <c:forEach items="${books}" var="book">
            <li>
                Name: <i>${book.title}</i><br>
                Taken count: <i>${book.takenCount}</i><br>
                Copies: <i>${book.copies}</i><br>
                Author details: <i>${book.author}</i><br>
                <br>
                <form:form action="${pageContext.request.contextPath}/books/customer/read"
                           method="post" modelAttribute="bookRequestDto">
                    <input name="bookId" type="hidden" value="${book.id}">
                    <input name="customerUsername" type="hidden" value="${pageContext.request.userPrincipal.name}">
                    <button type="submit">Read</button>
                </form:form>
            </li>
        </c:forEach>
    </ul>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
<a href="${pageContext.request.contextPath}/books/customer/${pageContext.request.userPrincipal.name}">Profile</a>
</body>
</html>
