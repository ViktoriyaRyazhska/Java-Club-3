<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All orders</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<div class="blockmain">
    <div class="content">
        <div class="info-buttons">
            <h2>Orders list:</h2>
        </div>

        <hr>
        <div class="tablbox1">
            <p class="idclass" style="margin-right: 40px">ID</p>
            <p >Lending/Rerurn Date</p>
        </div>
        <hr>

    <c:forEach items="${orderModel}" var="order">
        <div class="tablbox2">

            <p class="text2">${order.id}</p>
            <a href="/order/${order.id}" class="text1">	${order.lendingDate} </a>
            <a href="/order/${order.id}" class="text1">	${order.returnDate} </a>

        </div>


    </c:forEach>
</table>
    </div>
</div>
</body>
</html>
