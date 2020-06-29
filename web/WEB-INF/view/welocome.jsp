<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/29/2020
  Time: 11:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<br>
<div class="form">
    <form modelAttribute="login" method="post" action="Logout">
        <div style="color: #FF0000;">${message}</div>
        <table>
            <tr>
                <h1 align="center">Logout</h1>
            </tr>
            <tr>
                <input type="submit" value="Logout" >
            </tr>
        </table>
        <br>
    </form>
</div>
</body>
</html>
