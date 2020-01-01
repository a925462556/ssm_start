<%--suppress ALL --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>
<head>
    <title>结果页</title>
    <style>
        .lastRecord{
            background-color: lawngreen;
        }
    </style>
    <script src="${pageContext.request.contextPath}/js/jquery-3.3.1.min.js"></script>
    <script>
        function del() {
            var msg = "您真的确定要删除吗？\n\n请确认！";
            return confirm(msg) === true;
        }
        $(function () {
            $("table tr:last-child").addClass("lastRecord");

            //选择器选择所有被选中的复选框
            $("#allBox").click(function () {
                $("input[id != 'allBox']").prop("checked",$("#allBox").prop("checked"));
            })

            //对所有选中的checkbox项的totalCount进行计算
            $("#calBtn").click(function () {
                var totalCountResult = 0;
                //1.选中所有的属性为valueTr的tr标签
                var $selectTr = $("tr[name='valueTr'] > td > input:checked");

                $selectTr.each(function (index, element) {
                    totalCountResult += parseFloat($selectTr.get(index).getAttribute("oneOfNumber"));
                })

                $("#showPlace").html("计算结果总数为:"+totalCountResult)
            })

            //删除选中表单提交
            $("#delAllSelectBtn").click(function () {
                $("#delForm").submit();
            })
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

        <form action="../ticket/delSelected" method="post" id="delForm">
            <c:forEach items="${tickets}" var="ticket" varStatus="s">
                <tr name="valueTr">
                    <td>${s.count}<input type="checkbox" id="${ticket.id}" name="delId" value="${ticket.id}" oneOfNumber="${ticket.totalCount}"></td>
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
        </form>
    </table><br>
    <h3>
        <a href="../ticket/toCalOnePage">继续添加工票</a>
    </h3><br>
    <h3>
        <button id="calBtn">计算选中项综合</button>
    </h3><br>

    <h3 id="showPlace"></h3><br>

    <h3>
        <button id="delAllSelectBtn">删除选中项目</button>
    </h3><br>
</body>
</html>
