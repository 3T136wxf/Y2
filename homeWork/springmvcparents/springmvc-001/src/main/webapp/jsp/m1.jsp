<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/7/24
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="/static/js/jquery.js" type="text/javascript"></script>
    <title>Title</title>
</head>
<body>
<button id="b1">点我获取javabean 弹出User m2</button>
<br>
<button id="b2">点我获取List 弹出User m3</button>
<br>
<button id="b3">点我获取数组 弹出User m4</button>
<br>
<button id="b4">点我获取Map 弹出User m5</button>
<br>
<button id="b5">试List当中存放一组Map，map当中存储为String,User m6</button>
<br>
<button id="b6">测试一个DTO对象，多个对象组合 m7</button>
<br>
<button id="b7">变身表格形态！！！！！！！！！！</button>

<div id="content">

</div>
<script>

    $("#b1").click(function () {
        $.ajax({
            url: "/json/m2",
            type: "post",
            success: function (data) {
                alert("年龄：" + data.age);
                alert("姓名：" + data.userName);
                alert("编号：" + data.uid);
            }
        })
    })

    $("#b2").click(function () {
        $.ajax({
            url: "/json/m3",
            type: "post",
            success: function (data) {
                var lenth = data.length;
                for (var i = 0; i < lenth; i++) {
                    alert("第" + (i + 1) + "个，姓名：" + data[i].userName + ",年龄：" + data[i].age + ",编号：" + data[i].uid)
                }
            }
        })
    })

    $("#b3").click(function () {
        $.ajax({
            url: "/json/m4",
            type: "post",
            success: function (data) {
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    alert("第" + (i + 1) + "个,姓名：" + data[i].userName + ",年龄：" + data[i].age + ",编号：" + data[i].uid);
                }
            }
        })
    })

    $("#b4").click(function () {
        $.ajax({
            url: "/json/m5",
            type: "post",
            success: function (data) {
                alert("姓名：" + data.u1.userName);
                alert("年龄：" + data.u1.age);
                alert("编号：" + data.u1.uid);
                alert("------------------------------")
                alert("姓名：" + data.u2.userName);
                alert("年龄：" + data.u2.age);
                alert("编号：" + data.u2.uid);
            }
        })
    })

    $("#b5").click(function () {
        $.ajax({
            url: "/json/m6",
            type: "post",
            success: function (data) {
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    var map = data[i];
                    alert("第" + (i + 1) + "轮");
                    var user = map.user;
                    var dog = map.dog;
                    alert("人的信息：姓名：" + user.userName + "，年龄：" + user.age + "，编号：" + user.uid);
                    alert("狗的信息：名字：" + dog.name + "，颜色：" + dog.color);
                }
            }
        })
    })

    $("#b6").click(function () {
        $.ajax({
            url: "/json/m7",
            type: "post",
            success: function (data) {
                alert("年龄：" + data.user.age);
                alert("姓名：" + data.user.userName);
                alert("编号：" + data.user.uid);
                alert("----------------------------")
                alert("名字：" + data.dog.name);
                alert("颜色：" + data.dog.color);
            }
        })
    })

    $("#b7").click(function () {
        $.ajax({
            url: "/json/all",
            type: "post",
            success: function (data) {
                var html = "<table border='1'>"
                html += "<tr><th>姓名</th><th>年龄</th><th>编号</th></tr>";
                var len = data.length;
                for (var i = 0; i < len; i++) {
                    html += "<tr>"
                    html += "<td>" + data[i].userName + "</td>"
                    html += "<td>" + data[i].age + "</td>"
                    html += "<td>" + data[i].uid + "</td>"
                    html += "</tr>";
                }
                html += "</table>";

                $("#content").html(html);
            }
        })
    })
</script>

</body>
</html>
