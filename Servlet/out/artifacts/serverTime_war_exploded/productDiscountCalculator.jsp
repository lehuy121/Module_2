<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/8/2020
  Time: 10:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath}/display-discount">
    <label for="desc">Product Description</label>
    <input id="desc" name="productDescription"><br>
    <label for="price">List Price</label>
    <input id="price" name="listPrice"><br>
    <label for="discount">Discount Percent</label>
    <input id="discount" name="discountPercent"><br>
    <input type="submit" value="Calculator">
</form>
</body>
</html>
