<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>


<!DOCTYPE html>
<html>
<head>
    <title>工票修改页面</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script>
        function getNowFormatDate() {
            var date = new Date();
            var seperator1 = "-";
            var year = date.getFullYear();
            var month = date.getMonth() + 1;
            var strDate = date.getDate();
            if (month >= 1 && month <= 9) {
                month = "0" + month;
            }
            if (strDate >= 0 && strDate <= 9) {
                strDate = "0" + strDate;
            }
            var currentdate = year + seperator1 + month + seperator1 + strDate;
            return currentdate;
        }

        /*
            需求:
                1.查询数据库信息回显 (查询数据库)
         */

        $(function () {
            var date = getNowFormatDate();
            $("#time").attr("value",date);
        })
    </script>
</head>
<body>
    <form action="../ticket/calAndUpdate" method="post">
        表id:<input name="id" value="${ticket.id}"><br><%--不可选中--%>
        表份数:<input type="number" name="tableNum" value="${ticket.tableNum}"><br>
        A0张数:<input type="number" name="A0Num" value="${ticket.a0Num}"><br>
        A1张数:<input type="number" name="A1Num" value="${ticket.a1Num}"><br>
        A2张数:<input type="number" name="A2Num" value="${ticket.a2Num}"><br>
        A3张数:<input type="number" name="A3Num" value="${ticket.a3Num}"><br>
        A4张数:<input type="number" name="A4Num" value="${ticket.a4Num}"><br>
        图纸份数:<input type="number" name="paperNum" value="${ticket.paperNum}"><br>
        加数:<input type="number" name="addNum" value="${ticket.addNum}"><br>
        日期:<input type="date" id="time" name="date">
        <input type="submit" value="提交修改"><br>
    </form><br>
    <h3>
        <a href="../ticket/showAllTickets">不改了</a>
    </h3>

</body>
</html>
