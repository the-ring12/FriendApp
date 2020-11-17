<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
<form action="AddFriendServlet" method="post">
    姓名：<input type="text" name="fname" value=""><br>
    性别：<input type="radio" name="fgender" value="男" checked>男
    <input type="radio" name="fgender" value="女">女<br>
    电话：<input type="text" name="ftelephone" value=""><br>
    手机：<input type="text" name="fcellphone" value=""><br>
    备注：<input type="text" name="fremark" value=""><br>
    <input type="hidden" name="username" value="${username}"><br>
    <input type="submit" value="添加"><br>
</form>
</body>
</html>
