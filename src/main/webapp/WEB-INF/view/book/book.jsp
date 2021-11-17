<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books</title>
    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<%@include file="../header.jsp" %>

<div class="blockmain">
    <div class="content">
        <p class="text2" style="width: 650px">Назва книги: ${bookModel.title} </p>
        <p class="text2" style="width: 650px">Автор: ${bookModel.author}  </p>
        <p class="text2" style="width: 650px">Жанр: ${bookModel.genre} </p>
        <p class="text2" style="width: 650px">Кількість копій: ${bookModel.copies} </p>
        <br>
        <p class="text2" style="width: 650px">Чи доступна для видачі: ${isAvailable} </p>
        <p class="text2" style="width: 650px">Середній час читання: ${avgTimeOfReading} днів </p>
    </div>
</div>
</body>
</html>
