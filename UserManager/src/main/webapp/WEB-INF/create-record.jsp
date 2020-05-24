<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new Record</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%@include file="header.html"%>

<form action="/records/create" method="post">
    <table>
        <tr>
            <td>
                <label for="first-name">First Name: </label>
            </td>
            <td>
                <input type="text" id="first-name" name="first-name">
            </td>
        </tr>
        <tr>
            <td>
                <label for="last-name">Last Name: </label>
            </td>
            <td>
                <input type="text" id="last-name" name="last-name">
            </td>
        </tr>
        <tr>
            <td>
                <label for="address">Address: </label>
            </td>
            <td>
                <input type="text" id="address" name="address">
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
