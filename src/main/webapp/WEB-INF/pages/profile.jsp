<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>Profile</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.4/css/bootstrap.min.css"
          rel="stylesheet" media="screen" />
</head>
<body>

<div>
    <h4>${customer.username}</h4>
    <p>Age: ${customer.age}</p>
    <p>Register Date: ${customer.registerDate}</p>
</div>
<div>
    <table class="table table-striped">
        <thead>
        <tr class="header">
            <th scope="col">ID</th>
            <th scope="col">Title</th>
            <th scope="col">Taken</th>
            <th scope="col">Active</th>
        </tr>

        </thead>
        <tbody>
        <c:forEach items="${requests}" var="bookRequest">
            <tr>
                <th scope="row">${bookRequest.id}</th>
                <td>${bookRequest.book.title}</td>
                <td>${bookRequest.creationDate}</td>
                <td>${bookRequest.active}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

</body>
</html>
