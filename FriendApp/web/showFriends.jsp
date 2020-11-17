<%--
  Created by IntelliJ IDEA.
  User: Tan
  Date: 2020/11/15
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:choose>
    <c:when test="${empty flist}">
        没有满足条件的数据
    </c:when>
    <c:otherwise>
        <table border="1" align="center">
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>性别</th>
                <th>电话</th>
                <th>手机</th>
                <th>备注</th>
                <th>编辑</th>
            </tr>
            <c:forEach var="friend" items="${flist}" varStatus="s">
                <tr>
                    <td>${s.count}</td>
                    <td>${friend.fname}</td>
                    <td>${friend.fgender}</td>d
                    <td>${friend.ftelephone}</td>
                    <td>${friend.fcellphone}</td>
                    <td>${$friend.fremark}</td>
                    <td>
                        <a href="FriendDetailServlet?fid=${friend.fid}&opcode=u">修改信息</a>
                        <a href="FriendDetailServlet?fid=${friend.fid}&opcode=d">删除信息</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:otherwise>
</c:choose>
</body>
</html>
