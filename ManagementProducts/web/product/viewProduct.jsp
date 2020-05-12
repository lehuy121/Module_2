<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/12/2020
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product detail</title>
</head>
<body>
<h1>Product detail</h1>
<p>
    <a href="/products">Back to products list</a>
</p>
    <fieldset>
        <legend>Edit product information</legend>
        <table>
            <tr>
                <td>Name:</td>
                <td><input type="text" name="name" id="name" value="${loadProduct.getName()}"></td>
            </tr>
            <tr>
                <td>Price:</td>
                <td><input type="text" name="price" id="price" value="${loadProduct.getPrice()}"></td>
            </tr>
            <tr>
                <td>Description:</td>
                <td><input type="text" name="description" id="description" value="${loadProduct.getDescription()}"></td>
            </tr>
            <tr>
                <td>Provider:</td>
                <td><input type="text" name="provider" id="provider" value="${loadProduct.getProvider()}"></td>
            </tr>
        </table>
    </fieldset>
</body>
</html>
