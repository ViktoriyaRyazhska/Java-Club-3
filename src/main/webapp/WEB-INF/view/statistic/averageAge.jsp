<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Average age</title>
</head>
<body>
<form:form method="GET" action="/statistic/average" modelAttribute="averageAgeModel">
    <h1>Average age of Users registered in Library</h1>

</form:form>
</body>
</html>
