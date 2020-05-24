<%@ page import="com.softserve.itacademy.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info for User</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%
    User user = (User) request.getAttribute("user");
%>

    <p>Id: <%=user.getId()%></p>
    <p>Username: <%=user.getUsername()%></p>
    <p>Password: <%=user.getPassword()%></p>

</body>
</html>
