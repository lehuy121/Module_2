<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/14/2020
  Time: 9:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Sandwich Condiments</title>
</head>
<body>
<form:form action="/choose" method="post" modelAttribute="sandwichCondiments">
    <label>Lettuce
        <form:checkbox  value="${sandwichCondiments.lettuce}" path="lettuce"/> |
    </label>
    <label>Tomato
        <form:checkbox value = "${sandwichCondiments.tomato}" path="tomato"/> |
    </label>
    <label>Mustard
        <form:checkbox value = "${sandwichCondiments.mustard}" path="mustard"/> |
    </label>
    <label>Sprouts
        <form:checkbox value = "${sandwichCondiments.sprouts}" path="sprouts"/> |
    </label>
    <hr>
    <form:button>Save</form:button>
</form:form>
</body>
</html>
