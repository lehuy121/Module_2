<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/12/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<p>
    <a href="/products">Back to list products</a>
</p>

<h1>Result</h1>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Provider</td>
    </tr>
    <c:forEach var="product" items='${result}'>
        <tr>
            <td>${product.getName()}</td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProvider()}</td>
        </tr>
    </c:forEach>
</table>
</body>
