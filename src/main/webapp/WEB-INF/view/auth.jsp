<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>
<h1>Register</h1>
<form method="POST">
    First Name: <input type="text" name="firstName" /><br/>
    Last Name: <input type="text" name="lastName" /><br/>
    Email: <input type="text" name="email" /><br/>
    Password: <input type="password" name="password" /><br/>
    <input type="submit" value="Register" />
</form>
</body>
</html>