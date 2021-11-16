<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Book</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen"/>
</head>
<body>
<div>
    <form:form action="${pageContext.request.contextPath}/books/addBook" method="POST" modelAttribute="bookDto">
        <h3>Add Book to Library</h3>
        <div class="form-group" style="padding-right: 80%">
            Title: <input type="text" class="form-control" name="title"><br>
        </div>
        <div class="form-group" style="padding-right: 80%">
            Taken count: <input type="text" class="form-control" name="takenCount"><br>
        </div>
        <div class="form-group" style="padding-right: 80%">
            Copies: <input type="text" class="form-control" name="copies"><br>
        </div>
        <div class="form-group" style="padding-right: 80%">
            Author id: <input type="text" class="form-control" name="authorId"><br>
        </div>
        <div>
            <button type="submit" class="btn btn-black">Add Book</button>
        </div>
    </form:form>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
