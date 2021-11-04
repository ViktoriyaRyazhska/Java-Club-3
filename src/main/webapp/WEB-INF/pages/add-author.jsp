<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Author</title>
</head>
<body>
<c:url var="actionUrl" value="/addAuthor" />

<form:form action="${actionUrl}" method="POST" modelAttribute="authorDto">
    <h3>Add Author</h3>

    Name:
    <form:input type="text" path="name"></form:input>
    <form:errors path="name" /><br>
    Surname:
    <form:input type="text" path="surname"></form:input>
    <form:errors path="surname" /><br>


    <form:button id="add-author">Add Author</form:button>
</form:form>

</body>
</html>
