<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Book</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>
<body>
<div>
    <a href="${pageContext.request.contextPath}/">Home</a>
</div>
<div class="form-group">
    <div class="form-control">
        <h3>Book: ${book.title}</h3>
        Name: <i>${book.title}</i><br>
        Taken count: <i>${book.takenCount}</i><br>
        Copies: <i>${book.copies}</i><br>
        Author details: <i>${book.author}</i><br>
    </div>

    <form:form action="${pageContext.request.contextPath}/books/customer/read"
               method="post" modelAttribute="bookRequestDto">
        <input name="bookId" type="hidden" value="${book.id}">
        <input name="customerUsername" type="hidden" value="${pageContext.request.userPrincipal.name}">
        <button type="submit" class="btn btn-info">Read</button>
    </form:form>
</div>

</body>
</html>
