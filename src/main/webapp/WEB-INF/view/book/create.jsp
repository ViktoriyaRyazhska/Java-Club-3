<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create book</title>
</head>
<body>
<%@include file="../header.jsp" %>
<h3>Додайте нову книжку:</h3>
<div>
    <form:form method="POST" action="/book/create/"
               modelAttribute="createBook">
        <div>
            <span id="inputGroup-sizing-small">Назва</span>
            <form:input type="text" placeholder="Введіть назву" path="title"/>
        </div>
        <br>

        <label for="author">Обери автора:</label>
        <form:select path="author">
            <c:forEach items="${authors}" var="author">
                <form:option value="${author.id}">${author.name} ${author.surname}</form:option>
            </c:forEach>
        </form:select>
        <input type="submit" value="Підтвердити">
        <br>
        <br>
        <label for="author">Обери жанр:</label>
        <form:select path="genre">
            <c:forEach items="${genre}" var="genre">
                <form:option value="${genre.id}">${genre.name}</form:option>
            </c:forEach>
        </form:select>
        <input type="submit" value="Підтвердити">
        <br>
        <br>
        <div>
            <span id="inputGroup-sizing-small">Кількість копій</span>
            <form:input type="number" placeholder="Введіть кількість копій" path="copies"/>
        </div>
        <br>
        <br>
        <button class="btn btn-outline-success">Створити</button>
    </form:form>
</div>
</body>
</html>
