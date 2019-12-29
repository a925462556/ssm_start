<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>结果页</title>
    <style>
        .lastRecord{
            background-color: lawngreen;
        }
    </style>
    <script src="../../js/jquery-3.3.1.min.js"></script>
    <script>
        function del() {
            var msg = "您真的确定要删除吗？\n\n请确认！";
            return confirm(msg) === true;
        }
        $(function () {
            $("table tr:last-child").addClass("lastRecord");

        })
    </script>
</head>
<body>
    <table border="1">
        <tr>
            <td>序号<input type="checkbox" id="allBox"></td>
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
            <td>可选操作</td>
        </tr>
        <c:forEach items="${tickets}" var="ticket" varStatus="s">
            <tr>
                <td>${s.count}<input type="checkbox"></td>
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
                <td>
                    <a href="javascript:if(confirm('确实要删除吗?'))location='../ticket/deleteOne?id=${ticket.id}'">删除</a>
                    <a href="../ticket/toChangePage?id=${ticket.id}">修改</a>
                </td>
            </tr>
        </c:forEach>
    </table><br>
    <a href="../ticket/toCalOnePage">继续添加工票</a><br>
</body>
</html>
