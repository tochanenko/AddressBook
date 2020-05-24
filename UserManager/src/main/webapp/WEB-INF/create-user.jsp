<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new User</title>
    <link rel="stylesheet" href="../styles/style.css">
</head>
<body>

<%@include file="header.html"%>

<form action="/records/create" method="post">
    <table>
        <tr>
            <td>
                <label for="name">Name: </label>
            </td>
            <td>
                <input type="text" id="name" name="name">
            </td>
        </tr>
        <tr>
            <td>
                <label for="surname">Surname: </label>
            </td>
            <td>
                <input type="text" id="surname" name="surname">
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
