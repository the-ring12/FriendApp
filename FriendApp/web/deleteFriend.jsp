<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="DeleteFriendServlet" method="post">
    <input type="hidden" name="fid" value="${friend.fid}"/>
    姓名：${friend.fname}<br>
    性别：${friend.fgender}<br>
    电话：${friend.ftelephone}<br>
    手机：${friend.fcellphone}<br>
    备注：${friend.fremark}<br>
    <input type="submit" value="删除" /><br>
</form>
</body>
</html>
