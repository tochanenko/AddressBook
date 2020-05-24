<%@ page import="com.softserve.itacademy.entity.AddressBook" %>
<%@ page import="com.softserve.itacademy.Util" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Users List</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%@include file="header.html"%>

<p>Sort by: <a href="/records/list?sort=asc">ascending</a> | <a href="/records/list?sort=desc">descending</a></p>

<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Address</th>
        <th colspan="3">Operations</th>
    </tr>

    <%
        for (Object address : (AddressBook)request.getAttribute("book")) {
            String record = address.toString();
            String[] fields = Util.getFields(record);
    %>

    <tr>
        <td><%=fields[0]%></td>
        <td><%=fields[1]%></td>
        <td><%=fields[2]%></td>
        <td><a href="/records/read?first-name=<%=fields[0]%>&last-name=<%=fields[1]%>">Read</a></td>
        <td><a href="/records/update?first-name=<%=fields[0]%>&last-name=<%=fields[1]%>">Update</a></td>
        <td><a href="/records/delete?first-name=<%=fields[0]%>&last-name=<%=fields[1]%>">Delete</a></td>
    </tr>

    <%
        }
    %>

</table>

</body>
</html>
