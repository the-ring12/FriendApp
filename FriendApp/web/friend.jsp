<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 18:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="friend" class="com.module.Friend" scope="request"/>
<jsp:setProperty name="friend" property="*"/>
</body>
</html>
