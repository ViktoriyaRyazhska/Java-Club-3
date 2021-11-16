<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE HTML>
<html>
<head>
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>
<body>
<div>
    <h3><span style="text-transform: uppercase">${pageContext.request.userPrincipal.name}</span></h3>
    <sec:authorize access="!isAuthenticated()">
        <a href="${pageContext.request.contextPath}/login">Login</a><br>
        <a href="${pageContext.request.contextPath}/registration">Register</a><br>
    </sec:authorize>


    <sec:authorize access="isAuthenticated()">
        <a href="${pageContext.request.contextPath}/books/">Books</a><br>
        <a href="${pageContext.request.contextPath}/authors/">Authors</a><br>
        <a href="${pageContext.request.contextPath}/books/customer/${pageContext.request.userPrincipal.name}">Profile</a><br>
        <a href="${pageContext.request.contextPath}/logout">Logout</a><br>
    </sec:authorize>

    <sec:authorize access="hasRole('ADMIN')">
        <a href="${pageContext.request.contextPath}/admin">Users (only admin)</a><br>
        <div class="align-content-around">
        <a href="${pageContext.request.contextPath}/books/addBook">Add new Book to library</a><br>
        <a href="${pageContext.request.contextPath}/authors/addAuthor">Add new Author to library</a><br>
        </div>
    </sec:authorize>
</div>
</body>
</html>