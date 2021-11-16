<%--
  Created by IntelliJ IDEA.
  User: Tarasii Lyzunyk
  Date: 11/4/2021
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Author</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen" />
</head>
<body>
<div>
    <h3>Author: ${author.name} ${author.surname}</h3>

    Name: <i>${author.name}</i><br>
    Surname: <i>${author.surname}</i><br>
    <br>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
