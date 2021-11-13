<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All books</title>
</head>
<body>
<%@include file="../header.jsp" %>
<h2>Список книг:</h2>
<form action="/book/create">
    <input type="submit" value="Створити">
</form>
<table class="table table-hover table-bordered">

    <c:forEach items="${bookModel}" var="book">

        <tr>
            <td>
                <!-- <div style="margin-left: 60px;">
                    <a href="/book/${book.id}">	${book.title} </a>
                </div>-->

                <fieldset>
                    <legend>${book.id}</legend>
                    <h2><a href="/book/${book.id}">	${book.title} </a></h2>
                </fieldset>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
