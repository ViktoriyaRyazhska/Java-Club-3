<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>

<body>
<sec:authorize access="isAuthenticated()">
    <% response.sendRedirect("/"); %>
</sec:authorize>
<div class="sidenav">
    <div class="login-main-text">
        <h2>Application<br> Login Page</h2>
        <p>Login or register from here to access.</p>
    </div>
</div>
<div class="main">
    <div class="col-md-6 col-sm-12">
        <div class="login-form">

            <form method="POST" action="${pageContext.request.contextPath}/login">
                <div class="form-group">
                    <label>Username</label>
                    <input name="username" class="form-control" type="text" placeholder="Username" autofocus="true"/>
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input name="password" class="form-control" type="password" placeholder="Password"/>
                </div>
                <button type="submit" class="btn btn-black">Login</button>
            </form>
            <br>
            <a href="${pageContext.request.contextPath}/registration">
                <button type="submit" class="btn btn-secondary">Register</button>
            </a>

        </div>
    </div>
</div>

</body>
</html>