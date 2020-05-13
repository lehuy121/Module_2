<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/13/2020
  Time: 8:35 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD To VND</title>
</head>
<body>
<h1>Convert Money</h1>
<form action = "/convert-post" method="post">
    <fieldset>
        <legend>USD To VND</legend>
        <table>
            <tr>
                <td>Rate:</td>
                <td><input type="text" name="rate" id="rate"></td>
            </tr>
            <tr>
                <td>USD:</td>
                <td><input type="text" name="usd" id="usd"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </fieldset>
</form>
<fieldset>
    <legend>Result</legend>
    <tr>
        <td>VND:</td>
        <td><input type="text" name="vnd" id="vnd" value="${result}"></td>
    </tr>
</fieldset>
</body>
</html>
