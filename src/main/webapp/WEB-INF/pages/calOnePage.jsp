<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>计算器一</title>
    <script src="../../js/jquery-3.3.1.min.js"></script>
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

        $(function () {
            var date = getNowFormatDate();
            $("#time").attr("value",date);
        })
    </script>
</head>
<body>
    <form action="../ticket/calOneResult" method="post">
        表份数:<input type="number" name="tableNum" value="0"><br>
        A0张数:<input type="number" name="A0Num" value="0"><br>
        A1张数:<input type="number" name="A1Num" value="0"><br>
        A2张数:<input type="number" name="A2Num" value="0"><br>
        A3张数:<input type="number" name="A3Num" value="0"><br>
        A4张数:<input type="number" name="A4Num" value="0"><br>
        图纸份数:<input type="number" name="paperNum" value="0"><br>
        加数:<input type="number" name="addNum" value="0"><br>
        日期:<input type="date" id="time" name="date">
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>
