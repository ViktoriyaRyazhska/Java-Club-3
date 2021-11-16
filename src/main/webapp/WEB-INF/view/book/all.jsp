<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All books</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<%@include file="../header.jsp" %>
<div class="blockmain">
    <div class="content">
        <div class="info-buttons">
            <h3 >Список книг:</h3>
            <form action="/book/create">
                <input type="submit" value="Створити" class="book-buttons">
            </form>
            <form action="/book/bookStatistic">
                <input type="submit" value="Рейтинг книг" class="book-buttons">
            </form>
        </div>

        <hr>
        <div class="tablbox1">
            <p class="idclass">ID</p>
            <p >Title</p>
        </div>
        <hr>

    <c:forEach items="${bookModel}" var="book">
        <div class="tablbox2">

        <p class="text2">${book.id}</p>
        <a href="/book/${book.id}" class="text1">	${book.title} </a>

        </div>
    </c:forEach>

    </div>
</div>
</body>
</html>
