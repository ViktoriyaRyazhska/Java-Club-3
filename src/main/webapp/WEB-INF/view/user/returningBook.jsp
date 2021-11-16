<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Returning Book</title>
</head>
<body>
<%@include file="userPage.jsp" %>
<div>
    <form:form method="POST" action="/user" modelAttribute="returningModel">
        <h1>Lend book to Users</h1>
        <div>
            <form:form method="post" modelAttribute="users">
                <div>
                    <span id="inputGroup-sizing-small">Enter your id:</span>
                    <form:input type="text" placeholder="your id" path="id"/>
                </div>
            </form:form>
        </div>
        <div>
            <form:form method="post" modelAttribute="orders">
                <div>
                    <span id="inputGroup-sizing-small">Enter id of your odred:</span>
                    <form:input type="text" placeholder="your id" path="id"/>
                </div>
            </form:form>
        </div>
        <button type="submit">Submit</button>
    </form:form>
</div>
<a href="${pageContext.request.contextPath}/user">Back to user page</a>
</body>
</html>
