<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tarasii Lyzunyk
  Date: 11/4/2021
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authors</title>'
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>
<body>
<div>
    <table id="authors" class="table table-striped">
        <thead>
        <tr class="header">
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Surname</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${authors}" var="author">
            <tr>
                <th scope="row">${author.id}</th>
                <th>${author.name}</th>
                <th>${author.surname}</th>
                <td>
                    <form method="GET" action="${pageContext.request.contextPath}/books/author/${author.surname}">
                        <button type="submit" class="btn btn-info">AUTHOR'S BOOKS</button>
                    </form>
                </td>
                <sec:authorize access="hasRole('ADMIN')">
                    <td>
                        <form:form method="post"
                                   action="${pageContext.request.contextPath}/authors/delete/${author.id}">
                            <input type="submit" value="DELETE" class="btn btn-danger">
                        </form:form>
                    </td>
                </sec:authorize>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
