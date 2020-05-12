<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/9/2020
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% String productDescription = request.getParameter("productDescription");
    double listPrice = Double.parseDouble(request.getParameter("listPrice"));
    double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

    double discountAmount = listPrice * discountPercent * 0.01;
    double discountPrice = listPrice - discountAmount;
%>
<h2>Product Description: <%= productDescription %></h2>
<h2>List Price: <%= listPrice %></h2>
<h2>Discount Percent: <%= discountPercent %></h2>

<h1>Discount Amount: <%= discountAmount%></h1>
<h1>Discount Price: <%= discountPrice%></h1>
</body>
</html>
