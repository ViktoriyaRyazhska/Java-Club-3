<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Book</title>
</head>
<body>
<c:url var="actionUrl" value="/addBook"/>
<div>
    <form:form action="${actionUrl}" method="POST" modelAttribute="bookDto">
        <h3>Add Book to Library</h3>

        Title:
        <form:input type="text" path="title"></form:input>
        <form:errors path="title"/><br>
        Taken count:
        <form:input type="text" path="takenCount"></form:input>
        <form:errors path="takenCount"/><br>
        Copies:
        <form:input type="text" path="copies"></form:input>
        <form:errors path="copies"/><br>
        Author id:
        <form:input type="text" path="authorId"></form:input>
        <form:errors path="authorId"/><br>

        <form:button id="add-book">Add Book</form:button>
    </form:form>
</div>
<a href="${pageContext.request.contextPath}/">Home</a>
</body>
</html>
