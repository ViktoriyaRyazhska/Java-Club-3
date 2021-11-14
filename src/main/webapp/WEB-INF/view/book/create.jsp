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
        <br>
        <div>
            <span id="inputGroup-sizing-small">Кількість копій</span>
            <form:input type="number" placeholder="Введіть кількість копій" path="copies"/>
        </div>
        <br>
        <br>
        <button class="btn btn-outline-success">Створити</button>
    </form:form>
    <form:form method="POST" action="/book/create/"
               modelAttribute="createAuthorInBook">
        <div>
            <span id="inputGroup-sizing-small">Автор</span>
            <form:input type="text" placeholder="Введіть ім'я автора" path="name"/>
        </div>
        <br>
        <div>
            <span id="inputGroup-sizing-small">Автор</span>
            <form:input type="text" placeholder="Введіть прізвище автора" path="surname"/>
        </div>
        <br>
        <br>
    </form:form>
    <form:form method="POST" action="/book/create/"
               modelAttribute="createGenreInBook">
        <div>
            <span id="inputGroup-sizing-small">Автор</span>
            <form:input type="text" placeholder="Введіть id жанру" path="id"/>
        </div>
        <br>
    </form:form>
</div>
</body>
</html>
