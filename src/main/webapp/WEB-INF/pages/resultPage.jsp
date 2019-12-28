<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>结果页</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>序号</td>
            <td>表份数</td>
            <td>A0数量</td>
            <td>A1数量</td>
            <td>A2数量</td>
            <td>A3数量</td>
            <td>A4数量</td>
            <td>图纸份数</td>
            <td>加数</td>
            <td>计算结果</td>
            <td>提交日期</td>
        </tr>
        <c:forEach items="${tickets}" var="ticket" varStatus="s">
            <tr>
                <td>${s.count}</td>
                <td>${ticket.tableNum}</td>
                <td>${ticket.a0Num}</td>
                <td>${ticket.a1Num}</td>
                <td>${ticket.a2Num}</td>
                <td>${ticket.a3Num}</td>
                <td>${ticket.a4Num}</td>
                <td>${ticket.paperNum}</td>
                <td>${ticket.addNum}</td>
                <td>${ticket.totalCount}</td>
                <td>${ticket.dateStr}</td>
            </tr>
        </c:forEach>

    </table>
</body>
</html>
