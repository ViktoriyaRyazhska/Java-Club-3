<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lending Book</title>

    <style>
        <%@include file="../css/allBooks.css" %>
    </style>
</head>
<body>
<div class="blockmain">
    <div class="content">
        <form:form method="POST" action="/user/lending" modelAttribute="lendingModel">
            <h1>Lend book to Users</h1>
            <div>
                <form:select path="user.id">
                    <c:forEach items="${users}" var="user">
                        <option value="${user.id}">${user.name} ${user.surname}</option>
                    </c:forEach>
                </form:select>
            </div>
            <div>
                <form:select path="book.id">
                    <c:forEach items="${books}" var="book">
                        <option value="${book.id}">${book.title} ${book.author}</option>
                    </c:forEach>
                </form:select>
            </div>
            <input type="submit" value="Submit">
        </form:form>
        <a href="${pageContext.request.contextPath}/user">Back to user page</a>
    </div>
</div>
</body>
</html>
