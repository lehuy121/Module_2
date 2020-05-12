<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/12/2020
  Time: 10:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Products</title>
</head>
<body>
<p>
    <a href="/products?action=create">Create new product</a>
</p>
<form action="/products?action=search" method="post">
    <label for="searchByName">
        <input id="searchByName" name="searchByName" placeholder="Enter Product Name">
    </label>
    <button>Search By Name</button>
    <p>
            <span>${notFound}</span>
    </p>
</form>

<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Provider</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach var="product" items='${requestScope["products"]}'>
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getName()}</a></td>
            <td>${product.getPrice()}</td>
            <td>${product.getDescription()}</td>
            <td>${product.getProvider()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">Edit</a> </td>
            <td><a href="/products?action=delete&id=${product.getId()}">Delete</a> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
