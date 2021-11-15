<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All genres</title>
</head>
<body>
<%@include file="../header.jsp" %>
<h2>Список жанрів:</h2>
<form action="/genre/create">
    <input type="submit" value="Додати новий жанр">
</form>
<form action="/genre/delete">
    <input type="submit" value="Видалити жанр">
</form>
<table class="table table-hover table-bordered">

    <c:forEach items="${genreModel}" var="genre">
        <tr>
            <td>
                <fieldset>
                    <legend>${genre.id}</legend>
                    <h2><a href="/genre/${genre.id}"> ${genre.name} </a></h2>
                </fieldset>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
