<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Account</title>

    <style><%@include file="../css/header.css"%></style>
</head>
<body>
<div class="header">

    <div class="headerleft" style="margin-left: 18px">
        <a href="/" class="bottomhead onthis" style="font-size: 19px" >На Головну</a>
        <a href="/user/lending" class="bottomhead onthis" style="font-size: 19px" >Видати книгу</a>
        <a href="/user/return" class="bottomhead" style="text-align: center;font-size: 19px" >Повернути книгу</a>
        <a href="/user/statistic" class="bottomhead" style="font-size: 19px">Статистика</a>


    </div>
    <div class="headerright">
        <a href="order/all" class="bottomhead-resgister "  >Замовлення</a>
        <a href="/mail" class="bottomhead-resgister" >Надіслати повідомлення</a>
        <a class="bottomhead-resgister" href="<c:url value="/logout" />">Вийти</a>
    </div>
</div>

</body>
</html>
