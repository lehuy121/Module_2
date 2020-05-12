<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/10/2020
  Time: 7:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert USD To VND</title>
</head>
<body>
<h1>Currency Convert</h1>
<form action = "convert.jsp" method = "post">
    Rate:<br>
    <input name = "rate" type="text" value="22000"><br>
    USD:<br>
    <input name= "usd" type="text" value="0"><br>
    <input type="submit" value="Convert">
</form>

</body>
</html>
