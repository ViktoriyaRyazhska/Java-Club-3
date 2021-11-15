<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All orders</title>
</head>
<body>

<%@include file="../header.jsp" %>
<h2>Orders list:</h2>
    <c:forEach items="${orderModel}" var="order">
        <tr>
            <td>
                <fieldset>
                    <legend>${order.id}</legend>
                    <h4><a href="/order/${order.id}"> ${order.lendingDate}<br>${order.returnDate} </a></h4>
                </fieldset>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
