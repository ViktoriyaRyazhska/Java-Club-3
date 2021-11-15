<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order</title>
</head>
<body>
<div>
    <div class="container">
        Reader: ${orderModel.users} <br>
        Book: ${orderModel.book} <br>
        Lending date: ${orderModel.lendingDate} <br>
        Return date: ${orderModel.returnDate} <br>
    </div>
</div>
</body>
</html>
