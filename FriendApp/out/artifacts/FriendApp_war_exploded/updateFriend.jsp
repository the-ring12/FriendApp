<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 19:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>更新好友信息</h1>
<form action="UpdateFriendServlet" mathod="post">
    <input type="hidden" name="fid" value="${friend.fid}">
    姓名：<input type="text" name="fname" value="${friend.fname}"><br>
    性别：<input type="radio" name="fgender" value="男" ${friend.fgender == "男" ? checked : ""}>男
    <input type="radio" name="fgender" value="女" ${friend.fgender == "女" ? checked : ""}>女<br>
    电话：<input type="text" name="ftelephone" value="${friend.ftelephone}"><br>
    手机：<input type="text" name="fcellphone" value="${friend.fcellphone}"><br>
    备注：<input type="text" name="fremark" value="${friend.fremark}"><br>
    <input type="hidden" name="username" value="${username}"><br>
    <input type="submit" value="更新"><br>
</form>
</body>
</html>
