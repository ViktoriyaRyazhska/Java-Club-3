<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
<div>
    <div>
        <h4>Select the option below to send sample email:</h4>
        <form method="get" style="width: 200px;">
            <fieldset style="border: none; padding-left: 0px; padding-top: 0px">
                <table>
                    <tr>
                        <td>
                            <input type="submit" formaction="mail/send" value="Send Simple Email">
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>
</body>
</html>