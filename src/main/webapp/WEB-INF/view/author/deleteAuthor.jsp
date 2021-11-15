<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Author</title>

    <style><%@include file="../css/allBooks.css"%></style>
</head>
<body>
<%@include file="../header.jsp" %>
<div class="blockmain">
    <div class="content">
    <span id="inputGroup-sizing-small">Choose author</span>
    <br>
    <form:form method="DELETE" modelAttribute="authorModel">
        <select name="authors">
            <c:forEach items="${authorModel}" var="author">
                <option value="${author.id}">${author.name}${author.surname}</option>
            </c:forEach>
        </select>
        <button type="submit">Delete</button>
    </form:form>
    </br>
    <br>
    <a href="${pageContext.request.contextPath}/author/all">Back to author page</a>
    </br>
    </div>
</div>
</body>
</html>
