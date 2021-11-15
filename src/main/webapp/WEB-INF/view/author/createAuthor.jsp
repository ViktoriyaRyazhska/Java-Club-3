<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Author</title>
</head>
<body>
<div>
    <form:form method="POST" modelAttribute="authorModel">
        <h2>Create new Author</h2>
        <div>
            <span id="inputGroup-sizing-small">Name</span>
            <form:input type="text" path="name" placeholder="Name" autofocus="true"></form:input>
            <span id="inputGroup-sizing-small">Surname</span>
            <form:input type="text" path="surname" placeholder="Surname" autofocus="true"></form:input>
        </div>
        <button type="submit">Create</button>
    </form:form>
    <a href="${pageContext.request.contextPath}/author/all">Back to author page</a>
</div>
</body>
</html>
