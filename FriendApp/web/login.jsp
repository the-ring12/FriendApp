<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 13:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8" >
    <title>JSP page</title>
</head>
<body>
    ${msg}
    <h1>用户登录</h1>
    <form action="LoginServlet" method="post">
        用户名：<input type="text" name="username" value=""/><br>
        密码：<input type="password" name="userpass" value=""/><br>
        <input type="submit" value="登录"/>
    </form>
    <hr>
    <a href="reg.jsp">新用户注册</a>
</body>
</html>
