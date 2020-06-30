<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 6/28/2020
  Time: 10:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        form{
            text-size:10px;
            background-color: #ffa500;
            text-align:center;
            width: 350px;
            padding: 30px;
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
    response.setHeader("cache-control","no-cache,no-store");
%>
<div>
    <div class="form">
        <form modelAttribute="user" method="post" action="register">
            <div>${message}</div>
            <table>
                <tr>
                    <h1 align="center">Register</h1>
                </tr>
                <tr>
                    <td>First Name:</td>
                    <td><input type="text" name="firstName" placeholder="Firstname" required></td>
                </tr>
                <tr>
                    <td>Last Name:</td>
                    <td><input type="text" name="lastName" placeholder="Lastname" required></td>
                </tr>
                <tr>
                    <td>Phone No:</td>
                    <td><input type="text" name="phoneNumber" pattern="^[6789]{1}\d{9}$" placeholder="Phonenumber" required></td>
                </tr>
                <tr>
                    <td>Email ID:</td>
                    <td><input type="text" name="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$" placeholder="Email" required>
                    </td>
                </tr>
                <tr>
                    <td>Password:</td>
                    <td><label>
                        <input type="password" name="password" placeholder="Password" required>
                    </label></td>
                </tr>
            </table>
            <br>
            <input type="submit" value="Submit" />
        </form>
    </div>
</div>
</body>
</html>
