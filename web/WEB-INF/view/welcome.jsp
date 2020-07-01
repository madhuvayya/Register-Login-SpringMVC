<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
    <style>
        <%@include file="/WEB-INF/view/style.css"%>
    </style>
</head>
<body>
<%
    response.setHeader("cache-control","no-cache,no-store");
    if(session.getAttribute("email")==null) {
        response.sendRedirect("login");
    }
%>
<br>
<div class="div">
    <form method="post" action="logout">
        <br/>
        ${message}
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
