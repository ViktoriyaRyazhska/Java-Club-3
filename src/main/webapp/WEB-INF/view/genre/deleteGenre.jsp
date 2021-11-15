<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Genre</title>
</head>
<body>
<div>
    <span id="inputGroup-sizing-small">Choose genre</span>
    <br>
    <form:form method="DELETE" modelAttribute="genreModel">
        <select name="genre">
            <c:forEach items="${genreModel}" var="genre">
                <option value="${genre.id}">${genre.name}</option>
            </c:forEach>
        </select>
        <button type="submit">Delete</button>
    </form:form>
    </br>
    <br>
    <a href="${pageContext.request.contextPath}/genre/all">Back to genre page</a>
    </br>
</div>
</body>
</html>
