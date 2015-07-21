<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Log in</title>
</head>
<body>
<form name ="loginForm" action="controller" method="post">
    <input type="hidden" name="command" value="login"/>
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
    <br/>${errorLoginPassMessage}
         ${wrongAction}
         ${nullPage}
    <br/><input type="submit" value="Log in">
    <br/>
</form>
</body>
</html>