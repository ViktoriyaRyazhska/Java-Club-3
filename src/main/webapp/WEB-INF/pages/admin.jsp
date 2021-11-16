<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>List Users</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
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
                <td> <form method="GET" action="${pageContext.request.contextPath}/info/${user.username}">
                    <button type="submit" class="btn btn-info">Get info</button>
                </form>
                </td>
                <td>
                    <form:form method="post"
                          action="${pageContext.request.contextPath}/customer/delete/${user.id}">
                        <input type="submit" value="DELETE" class="btn btn-danger" >
                    </form:form>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/">Home</a>
</div>

</body>
</html>
