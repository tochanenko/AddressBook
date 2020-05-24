<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Record</title>
    <style>
        <%@include file="style.css"%>
    </style>
</head>

<%@include file="header.html" %>

<body>

<%
    String firstName = (String) request.getAttribute("first-name");
    String lastName = (String) request.getAttribute("last-name");
    String address = (String) request.getAttribute("address");

    if (firstName != null || lastName != null || address != null) {
%>

<h3>Record with name "<%=firstName%> <%=lastName%>" exists!</h3>

<%
    }
%>

<form action="/records/create" method="post">
    <table>
        <tr>
            <td>
                <label for="first-name">First Name: </label>
            </td>
            <td>
                <input type="text" id="first-name" name="first-name" value="<%=firstName == null ? " " : firstName%>">
            </td>
        </tr>
        <tr>
            <td>
                <label for="last-name">Last Name: </label>
            </td>
            <td>
                <input type="text" id="last-name" name="last-name" value="<%=lastName == null ? " " : lastName%>">
            </td>
        </tr>
        <tr>
            <td>
                <label for="address">Address: </label>
            </td>
            <td>
                <input type="text" id="address" name="address" value="<%=address == null ? " " : address%>">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Create">
            </td>
            <td>
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>
</form>

</body>
</html>
