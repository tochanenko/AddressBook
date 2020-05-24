<%@ page import="com.softserve.itacademy.entity.User" %>
<%@ page import="java.util.List" %>
<%@ page import="com.softserve.itacademy.entity.AddressBook" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%@include file="header.html"%>

<table>
    <tr>
        <th>Id</th>
        <th>Username</th>
        <th>Password</th>
        <th colspan="3">Operations</th>
    </tr>

    <%
        for (Object address : (AddressBook)request.getAttribute("book")) {
    %>

    <p><%=address.toString()%></p>

    <tr>
<%--        <td><%=user.getId()%></td>--%>
<%--        <td><%=user.getUsername()%></td>--%>
<%--        <td><%=user.getPassword()%></td>--%>
<%--        <td><a href="/users/read?id=<%=book.iterator().getId()%>">Read</a></td>--%>
<%--        <td><a href="/users/update?id=<%=user.getId()%>">Update</a></td>--%>
<%--        <td><a href="/users/delete?id=<%=user.getId()%>">Delete</a></td>--%>
    </tr>

    <%
        }
    %>

</table>

</body>
</html>
