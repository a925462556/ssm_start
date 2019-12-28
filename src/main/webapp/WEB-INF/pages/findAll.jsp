<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询所有</title>
</head>
<body>
    <h3>查询所有账户</h3>

    <c:forEach var="account" items="${accounts}">
        账户id:${account.id}<br>
        帐户名:${account.name}<br>
        密码:${account.money}<br>
        <br>
    </c:forEach>

</body>
</html>
