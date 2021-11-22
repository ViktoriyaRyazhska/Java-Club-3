<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Statistic</title>
    <style>
        <%@include file="../css/allBooks.css" %>
    </style>
</head>
<body>

<%@include file="userPage.jsp" %>
<div class="blockmain">
    <div class="content">
        <a href="${pageContext.request.contextPath}/user/statistic/average"><h4>Average age</h4></a> <br>
        <a href=""><h4>How long user work with library</h4></a> <br>
        <a href=""><h4>Average number of requests</h4></a> <br>
        <a href=""><h4>Users who has not returned book on time</h4></a> <br>
        <a href=""><h4>How many requests user did to library</h4></a> <br>
        <a href=""><h4>How many book are reading now</h4></a> <br>
        <a href=""><h4>How many books are read</h4></a> <br>
        <a href=""><h4>Average time of reading book</h4></a> <br>
    </div>
</div>
</body>
</html>
