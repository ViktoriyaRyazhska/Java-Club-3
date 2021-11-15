<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div>
    <div class="container">
        Name: ${userModel.name} <br>
        Surname: ${userModel.surname} <br>
        Surname: ${userModel.surname} <br>
        Age: ${userModel.age} <br>
        Email: ${userModel.email} <br>
        Registration date: ${userModel.date} <br>
        Borrowed books: ${userModel.bookOrderList} <br>
        <br>
        <br>
    </div>
</div>
</body>
</html>
