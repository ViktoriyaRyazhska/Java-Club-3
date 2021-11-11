<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE HTML>
<html>
<head>
    <title>Main Page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="stylesheet" type="text/css" href="${contextPath}/resources/css/style.css">
</head>
<body>
<div>
    <h3>${pageContext.request.userPrincipal.name}</h3>
    <sec:authorize access="!isAuthenticated()">
        <h4><a href="${pageContext.request.contextPath}/login">Login</a></h4>
        <h4><a href="${pageContext.request.contextPath}/registration">Register</a></h4>
    </sec:authorize>
    <sec:authorize access="isAuthenticated()">
        <h4><a href="${pageContext.request.contextPath}/books">All Books</a></h4>
        <h4><a href="${pageContext.request.contextPath}/logout">Logout</a></h4>
    </sec:authorize>
    <sec:authorize access="hasRole('ADMIN')">
    <h4><a href="${pageContext.request.contextPath}/admin">Users (only admin)</a></h4>
    </sec:authorize>
</div>
</body>
</html>