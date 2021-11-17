<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<div class="blockmain">
    <div class="content">
        <p class="text2" style="width: 650px">Reader: ${orderModel.users.name} ${orderModel.users.surname} </p>
        <p class="text2" style="width: 650px">Book: ${orderModel.book.title} ${orderModel.book.author}  </p>
        <p class="text2" style="width: 650px">Lending date: ${orderModel.lendingDate} </p>
        <p class="text2" style="width: 650px">Return date: ${orderModel.returnDate} </p>

    </div>
</div>
</body>
</html>
