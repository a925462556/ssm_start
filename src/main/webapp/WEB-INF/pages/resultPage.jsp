<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>结果页</title>
</head>
<body>
    <table border="1">
        <tr>
            <td>表份数</td>
            <td>${ticket.tableNum}</td>
        </tr>
        <tr>
            <td>A0数量</td>
            <td>${ticket.a0Num}</td>
        </tr>
        <tr>
            <td>A1数量</td>
            <td>${ticket.a1Num}</td>
        </tr>
        <tr>
            <td>A2数量</td>
            <td>${ticket.a2Num}</td>
        </tr>
        <tr>
            <td>A3数量</td>
            <td>${ticket.a3Num}</td>
        </tr>
        <tr>
            <td>A4数量</td>
            <td>${ticket.a4Num}</td>
        </tr>
        <tr>
            <td>图纸份数</td>
            <td>${ticket.paperNum}</td>
        </tr>
        <tr>
            <td>加数</td>
            <td>${ticket.addNum}</td>
        </tr>
        <tr>
            <td>计算结果</td>
            <td>${ticket.totalCount}</td>
        </tr>
        <tr>
            <td>提交日期</td>
            <td>${ticket.dateStr}</td>
        </tr>
    </table>
</body>
</html>
