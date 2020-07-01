<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <style>
        <%@include file="/WEB-INF/view/style.css"%>
    </style>
</head>
<body>
<%
    response.setHeader("cache-control","no-cache,no-store,must-revalidate");
%>
<br>
<div class="div">
    <form method="post" action="login">
        <br/>
        ${message}
        <table>
            <tr>
                <h1 align="center">Login</h1>
            </tr>
            <tr>
                <td>Email:</td>
                <td><input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Email"  /></td>
            </tr>
            <tr>
                <td>Password:</td>
                <td>
                    <input type="password" name="password" placeholder="Password" required>
                </td>
            </tr>
        </table>
        <br>
        <input type="submit" value="Login" />
    </form>
</div>
</body>
</html>
