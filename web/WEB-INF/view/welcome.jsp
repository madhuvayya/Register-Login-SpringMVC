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
    <style>
        form{
            text-size:10px;
            background-color: #FFA500;
            text-align:center;
            width: 300px;
            padding: 50px;
            margin: 20px;
            display: inline-block;
            position: absolute;
            left: 50%;
            top:30%;
            transform: translate(-50%, -50%);
        }
    </style>
</head>
<body>
<br>
<div class="form">
    <form modelAttribute="login" method="post" action="logout">
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
