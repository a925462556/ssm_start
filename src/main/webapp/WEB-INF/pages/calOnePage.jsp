<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>计算器一</title>
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
