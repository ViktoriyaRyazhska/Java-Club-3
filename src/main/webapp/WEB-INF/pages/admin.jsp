<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>List Users</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/3.3.4/css/bootstrap.min.css"
          rel="stylesheet" media="screen" />
</head>

<body>
<div>
    <table class="table table-striped">
        <thead>
        <tr class="header">
            <th scope="col">ID</th>
            <th scope="col">Username</th>
            <th scope="col">Password</th>
            <th scope="col">Role</th>
        </tr>

        </thead>
        <tbody>
        <c:forEach items="${allUsers}" var="user">
            <tr>
                <th scope="row">${user.id}</th>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td><c:forEach items="${user.role}" var="r">${r.name}</c:forEach></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/">Home</a>
    <a href="${pageContext.request.contextPath}/books/customer/${pageContext.request.userPrincipal.name}">Profile</a>
</div>

<spring:url value="${pageContext.request.contextPath}/WEB-INF/pages/js/bootstrap.min.js" var="bootstrapJs"/>

<script src="${bootstrapJs}"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</body>
</html>
