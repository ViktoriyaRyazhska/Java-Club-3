<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All authors</title>
</head>
<body>
<%@include file="../header.jsp" %>
<h2>Список авторів:</h2>
<form action="/author/create">
    <input type="submit" value="Додати нового автора">
</form>
<form action="/author/delete">
    <input type="submit" value="Видалити автора">
</form>
<table class="table table-hover table-bordered">

    <c:forEach items="${authorModel}" var="author">
        <tr>
            <td>
                <fieldset>
                    <legend>${author.id}</legend>
                    <h2><a href="/genre/${author.id}"> ${author.name} ${author.surname} </a></h2>
                </fieldset>
            </td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
