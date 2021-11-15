<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Genre</title>
</head>
<body>
<div>
    <form:form method="POST" modelAttribute="genreModel">
        <h2>Create new Genre</h2>
        <div>
            <span id="inputGroup-sizing-small">Name</span>
            <form:input type="text" path="name" placeholder="Name" autofocus="true"></form:input>
        </div>
        <button type="submit">Create</button>
    </form:form>
    <a href="${pageContext.request.contextPath}/genre/all">Back to genre page</a>
</div>
</body>
</html>
