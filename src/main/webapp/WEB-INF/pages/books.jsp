<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Books</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>
<body>

<div class="form-group">
    <form method="GET" action="${pageContext.request.contextPath}/books/title/${book.title}">
        <div class="form-control">
            <input name="title" class="form-control" type="text" placeholder="Find book by Title" autofocus="true"/>
        </div>
    </form>
    <form method="GET" action="${pageContext.request.contextPath}/books/author/${author.surname}">
        <div class="form-control">
            <input name="surname" class="form-control" type="text" placeholder="Find book by Author surname"
                   autofocus="true"/>
        </div>
    </form>
</div>

<div>
    <table id="books" class="table table-striped">
        <thead>
        <tr class="header">
            <th scope="col">Id</th>
            <th scope="col">Title</th>
            <th scope="col">Taken Count</th>
            <th scope="col">Copies</th>
            <th scope="col">Author</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${books}" var="book">
        <tr>
            <th scope="row">${book.id}</th>
            <td>${book.title}</td>
            <td>${book.takenCount}</td>
            <td>${book.copies}</td>
            <td>${book.author}</td>

            <td><form:form action="${pageContext.request.contextPath}/books/customer/read"
                           method="post" modelAttribute="bookRequestDto">
                <input name="bookId" type="hidden" value="${book.id}">
                <input name="customerUsername" type="hidden" value="${pageContext.request.userPrincipal.name}">
                <button type="submit" class="btn btn-info">Read</button>
            </form:form>
            </td>
            <sec:authorize access="hasRole('ADMIN')">
                <td>
                    <form:form method="post"
                               action="${pageContext.request.contextPath}/books/delete/${book.id}">
                        <input type="submit" value="DELETE" class="btn btn-danger">
                    </form:form>
                </td>
            </sec:authorize>

        </tr>
        </c:forEach>

</div>

<div class="form-group">
    <a href="${pageContext.request.contextPath}/">Home</a><br>
</div>

</body>
</html>

