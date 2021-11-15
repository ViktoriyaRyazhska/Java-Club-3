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


    <div class="headerleft">

        <a href="/user/lending" class="bottomhead onthis" >Видати книгу</a>
        <a href="" class="bottomhead" style="text-align: center" >Повернути книгу</a>
        <a href="/user/statistic" class="bottomhead">Статистика</a>

    </div>
    <div class="headerright">
        <a href="order/all" class="bottomhead-resgister " >Замовлення</a>
        <a href="/mail" class="bottomhead-resgister" >Надіслати повідомлення</a>
        <a class="bottomhead-resgister" href="<c:url value="/logout" />">Вийти</a>
    </div>
</div>

</body>
</html>
