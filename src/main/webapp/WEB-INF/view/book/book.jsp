<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div>
    <div class="container">
        Назва книги: ${bookModel.title} <br>
        Автор: ${bookModel.author} <br>
        Жанр: ${bookModel.genre} <br>
        Кількість копій: ${bookModel.copies} <br>
        <br>
        <br>
        Чи доступна для видачі: ${isAvailable} <br>
        Середній час читання: ${avgTimeOfReading} днів<br>
    </div>
</div>
</body>
</html>
