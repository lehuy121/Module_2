<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action = "/customerList" method="post">
    <button type="submit">Display</button>
    <h3>Customer List</h3>
    <div class="customer">
        <table border="1">
            <tr>
                <th id="name">Name
                <th id="birth">Birth
                <th id="address">Address
                <th id="image">Image
            </tr>
            <c:forEach var = "customer" items="${customerList}">
                <tr>
                    <td><c:out value="${customer.name}"></c:out></td>
                    <td><c:out value="${customer.birth}"></c:out></td>
                    <td><c:out value="${customer.address}"></c:out></td>
                    <td><img src="<c:out value="${customer.image}"></c:out>"></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</form>

</body>
</html>
