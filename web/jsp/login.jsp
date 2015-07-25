<%@ page pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="/com.epam.prihodko.task6/localization.locale" var="loc"/>
<fmt:message bundle="${loc}" key="locale.message.Login" var="Login"/>
<fmt:message bundle="${loc}" key="locale.message.Password" var="Password"/>
<!DOCTYPE html>
<html lang="${language}">
<head>
    <title>Log in</title>
</head>
<body>
<form>
    <div align="right">
        <select id="language" name="language" onchange="submit()">
        <option value="en_EN" ${language == 'en_EN' ? 'selected' : ''}>English</option>
        <option value="ru_RU" ${language == 'ru_RU' ? 'selected' : ''}>Русский</option>
    </select>
    </div>
</form>


<form action="controller" method="post">
    <input type="hidden" id="command" name="command" value=""/>
    <table >
        <tr>
            <td>${Login}</td>
            <td><input type="text" name="login" value=""></td>
        </tr>
        <tr>
            <td>${Password}</td>
            <td><input type="password" name="password"  value=""></td>
        </tr>
    </table>
    <br/>
    ${errorLoginPassMessage}
    ${wrongAction}
    ${nullPage}
    <br/>
    <input type="submit" onclick="document.getElementById('command').value='login';" value="${Login}">
</form>
</body>
</html>