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
<%
//    response.setHeader("cache-control","no-cache,no-store");
    if(session.getAttribute("email")==null) {
        response.sendRedirect("login");
    }
%>
<br>
<div>

    <form method="post" action="logout">
        <div>${message}</div>
        <table>
            <tr>
                <h1 align="center">Welcome</h1>
            </tr>
            <p>email:${email}</p>
            <tr>
                <input type="submit" value="Logout" >
            </tr>
        </table>
        <br>
    </form>
</div>
</body>
</html>
