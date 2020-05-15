<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/15/2020
  Time: 11:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
<h1>
  Calculator
</h1>
<form action="/result" method="post">
  <input name ="first" type="text"/>
  <input name="second" type="text"/><br>
  <input type="submit" name ="operator" value="+"/>
  <input type="submit" name ="operator" value="-"/>
  <input type="submit" name ="operator" value="*"/>
  <input type="submit" name ="operator" value="/"/>
</form>
  <h2>${result}</h2>
  </body>
</html>
