<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>User Account</title>
    <style>
        .menu {
            width: 100%;
            height: 60px;
            display: flex;
        }

        .left, .right {
            width: 50%;
            display: flex;
            justify-content: center;
            align-items: center;
            margin-right: 30px;
            color: black;
        }

        .left a, .right a {
            margin-right: 30px;
        }

        .left a:hover, .right a:hover {
            color: black;
            font-weight: 700;
        }
    </style>
</head>
<body>
<div class="menu">

    <div class="left">
        <a href="">Взяти книгу</a>
        <a href="">Повернути книгу </a>
        <a href="">Статистика </a>

    </div>

    <div class="right">
        <a href="/mail">Надіслати повідомлення</a>
        <a href="<c:url value="/logout" />">Вийти</a>
    </div>
</div>
</body>
</html>
