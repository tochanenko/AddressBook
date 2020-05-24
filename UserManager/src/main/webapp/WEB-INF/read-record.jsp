<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show info for Record</title>
    <style>
        <%@include file="style.css"%>
    </style>
</head>
<body>

<%@include file="header.html"%>

<%
    String firstName = (String)request.getAttribute("first-name");
    String lastName = (String)request.getAttribute("last-name");
    String address = (String)request.getAttribute("address");
%>

    <p><b>First Name:</b> <%=firstName%></p>
    <p><b>Last Name:</b> <%=lastName%></p>
    <p><b>Address:</b> <%=address%></p>

</body>
</html>
