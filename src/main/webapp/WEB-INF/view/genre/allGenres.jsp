<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All genres</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<%@include file="../header.jsp" %>
    <div class="blockmain">
        <div class="content">
            <div class="info-buttons" style="margin-left: 320px">
                <h3>Список жанрів:</h3>
                <form action="/genre/create">
                    <input type="submit" value="Додати новий жанр" class="book-buttons">
                </form>
            </div>
           <hr>

        <div class="tablbox1">
                    <p class="idclass">ID</p>
                    <p >Name</p>
            </div>
            <hr>

    <c:forEach items="${genreModel}" var="genre">
        <div class="tablbox2">

            <p class="text2">${genre.id}</p>
            <a href="/genre/${genre.id}" class="text1">${genre.name}  </a>


        </div>
    </c:forEach>
        </div>
    </div>
</table>
</body>
</html>
