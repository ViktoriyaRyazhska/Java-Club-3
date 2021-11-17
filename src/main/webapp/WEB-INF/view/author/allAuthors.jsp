<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All authors</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<%@include file="../header.jsp" %>
<div class="blockmain">
    <div class="content">
        <div class="info-buttons" style="margin-left: 320px">
<h3>Список авторів:</h3>
<form action="/author/create">
    <input type="submit" value="Додати нового автора" class="book-buttons">
</form>
        </div>

        <hr>
        <div class="tablbox1">
            <p class="idclass">ID</p>
            <p >Name</p>
        </div>
        <hr>

    <c:forEach items="${authorModel}" var="author">
        <div class="tablbox2">

            <p class="text2">${author.id}</p>
            <a href="/author/${author.id}" class="text1">${author.name} ${author.surname}   </a>

        </div>

    </c:forEach>

    </div>
</div>
</body>
</html>
