<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/10/2020
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Convert Result</title>
</head>
<body>
<%
    int rate = Integer.parseInt(request.getParameter("rate"));
    int usd = Integer.parseInt(request.getParameter("usd"));

    int result = rate * usd;
%>
<h1>Rate: <%=rate%>
</h1>
<h1>USD: <%=usd  %>
</h1>
<h1>VND: <%=result  %>
</h1>
</body>
</html>
