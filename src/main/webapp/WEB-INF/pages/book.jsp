<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book</title>
</head>
<body>

<div>
    <h3>Book: ${book.title}</h3>
    Name: <i>${book.title}</i><br>
    Taken count: <i>${book.takenCount}</i><br>
    Copies: <i>${book.copies}</i><br>
    Author details: <i>${book.author}</i><br>
    <br>
</div>
</body>
</html>
