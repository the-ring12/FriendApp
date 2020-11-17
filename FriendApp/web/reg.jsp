<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 13:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
    ${msg}
<h1>新用户注册</h1>
<form action="RegServlet" method="post">
    用户名：<input type="text" name="username" value=""/><br>
    密码：<input type="password" name="userpass" value=""/><br>
    <input type="submit" value="注册"/>
</form>
</body>
</html>
