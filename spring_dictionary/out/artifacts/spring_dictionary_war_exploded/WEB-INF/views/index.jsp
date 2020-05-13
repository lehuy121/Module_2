<%--
  Created by IntelliJ IDEA.
  User: lehuy
  Date: 5/13/2020
  Time: 10:00 AM
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <title>Dictionary</title>
</head>
<body>
<h1>Translate</h1>
<form action = "/translate" method="post">
  <fieldset>
    <legend>Translate</legend>
    <table>
      <tr>
        <td>English:</td>
        <td><input type="text" name="eng" id="eng" value="${eng}"></td>
      </tr>
      <tr>
        <td><input type="submit" value="Translate"></td>
      </tr>
    </table>
  </fieldset>
</form>
<fieldset>
  <legend>Result</legend>
  <tr>
    <td>Vietnamese</td>
    <td><input type="text" name="vn" id="vn" value="${result}"></td>
  </tr>
</fieldset>
</body>
</html>
