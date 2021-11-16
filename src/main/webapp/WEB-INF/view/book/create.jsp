<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create book</title>

    <style>
        <%@include file="../css/allBooks.css" %>
    </style>
</head>
<body>
<%@include file="../header.jsp" %>

<div class="blockmain">
    <div class="content">
        <h3>Додайте нову книжку:</h3>
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
            <form:form method="POST" action="/book/create/"
                       modelAttribute="authors">
                <div>
                    <span id="inputGroup-sizing-small">Id автора</span>
                    <form:input type="number" placeholder="Введіть id автора" path="id"/>
                </div>
            </form:form>
            <br/>
            <form:form method="POST" action="/book/create/"
                       modelAttribute="genre">
            <div>
                <span id="inputGroup-sizing-small">Id жанру</span>
                <form:input type="number" placeholder="Введіть id жанру" path="id"/>
            </div>
            </form:form>
            <br>
            <button class="btn btn-outline-success">Створити</button>

            <br/><br/>
        </form:form>
    </div>
</div>
</body>
</html>
