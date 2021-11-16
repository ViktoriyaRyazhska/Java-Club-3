<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Author</title>
    <link href="http://cdn.jsdelivr.net/webjars/bootstrap/4.0.0/css/bootstrap.min.css"
          rel="stylesheet" media="screen" />
</head>
<body>
<div>
    <form:form action="${pageContext.request.contextPath}/authors/addAuthor" method="POST" modelAttribute="authorDto">

        <h3>Add Author</h3>
        <div class="form-group" style="padding-right: 80%">
            Name: <input type="text" class="form-control" name="name">
            Surname: <input type="text" class="form-control" name="surname">
        </div>

        <div>
            <button type="submit" class="btn btn-black">Add Author</button>
        </div>
    </form:form>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
