<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Регистрация</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>

<body>
<div class="sidenav">
    <div class="login-main-text">
        <h2>Register<br> your account</h2>
    </div>
</div>

<div class="main">
    <div class="col-md-6 col-sm-12">
        <div class="login-form">
            <form:form method="POST" modelAttribute="userForm">

                <div class="form-group">
                    <label>Username</label><br>
                    <input type="text" name="username" class="form-control">
                </div>

                <div class="form-group">
                    <label>Password</label><br>
                    <input type="text" name="password" class="form-control">
                </div>

                <div class="form-group">
                    <label>Confirm your password</label><br>
                    <input type="text" name="passwordConfirm" class="form-control">
                </div>
                <div class="form-group">
                    <label>Your age</label><br>
                    <input type="text" name="age" class="form-control">
                </div>
                <button type="submit" class="btn btn-black">Register</button>
            </form:form>
            <a href="${pageContext.request.contextPath}/">Home</a>
        </div>
    </div>
</div>
</body>
</html>
