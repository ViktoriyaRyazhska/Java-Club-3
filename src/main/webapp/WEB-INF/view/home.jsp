<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head><title>Login Page</title></head>
<body>
<h3>Login with Username and Password</h3>
<form name='f' action='/home' method='POST'>
    <table>
        <tr><td>User:</td><td>
            <input type='text' name='username' value=''></td></tr>
        <tr><td>Password:</td>
            <td><input type='password' name='password'/></td></tr>
        <tr><td colspan='2'>
            <input name="submit" type="submit" value="Login"/></td></tr>
        <input name="_csrf" type="hidden"
               value="6829b1ae-0a14-4920-aac4-5abbd7eeb9ee" />
    </table>
</form>
</body>
</html>