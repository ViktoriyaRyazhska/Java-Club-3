<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
<div class="blockmain">
    <div class="content">
        <form:form method="POST" action="/book/create" modelAttribute="createBook">
            <h1>Lend book to Users</h1>
            <div>
                <span id="inputGroup-sizing-small">Book Title</span>
                <form:input path="title"></form:input> <br>
            </div>
            <div>
                <span id="inputGroup-sizing-small">Number of copies</span>
                <form:input path="copies"></form:input> <br>
            </div>
            <span id="inputGroup-sizing-small">Genre</span>
            <form:select path="genre.id">
                <c:forEach items="${genre}" var="genre">
                    <option value="${genre.id}">${genre.name} </option>
                </c:forEach>
            </form:select> <br>
            <div>
                <span id="inputGroup-sizing-small">Author</span>
                <form:select path="author">
                    <c:forEach items="${authors}" var="author">
                        <option value="${author.id}">${author.name} ${author.surname}</option>
                    </c:forEach>
                </form:select> <br>
            </div>
            <input type="submit" value="Submit">
        </form:form>
    </div>
</div>
</body>
</html>
