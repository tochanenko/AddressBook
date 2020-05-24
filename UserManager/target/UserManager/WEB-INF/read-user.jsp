<%@ page import="com.softserve.itacademy.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info for User</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%@include file="header.html"%>

<%
    User user = (User) request.getAttribute("user");
%>

    <p><b>Id:</b> <%=user.getId()%></p>
    <p><b>Username:</b> <%=user.getUsername()%></p>
    <p><b>Password:</b> <%=user.getPassword()%></p>

</body>
</html>
