<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP page</title>
</head>
<body>
<jsp:useBean id="user" class="com.module.User" scope="request"/>
<jsp:setProperty name="user" property="*"/>
</body>
</html>
