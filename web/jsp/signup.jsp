<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h3>Please, enter your new login & password</h3>
<input type="hidden" id="command" name="command" value=""/>
<table>
    <tr>
        <td>Login:</td>
        <td><input type="text" name="login" value=""></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="password" name="password"  value=""></td>
    </tr>
</table>
<br/><input type="submit" onclick="document.getElementById('command').value='signup';" value="Sign up">
<br/><a href="/jsp/login.jsp">Previous Page</a>
</body>
</html>
