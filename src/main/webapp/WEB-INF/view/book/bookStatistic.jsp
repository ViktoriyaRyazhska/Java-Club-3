<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Book Statistic</title>
    <style>
        <%@include file="../css/allBooks.css" %>
    </style>
</head>
<body>

<%@include file="../header.jsp" %>
    <div class="blockmain">
        <div class="content">
Загальна статистика книжок: ${statistic}
    </div>
</div>
</body>
</html>
