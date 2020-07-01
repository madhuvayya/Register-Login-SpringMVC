<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <style>
        <%@include file="/WEB-INF/view/style.css"%>
    </style>
</head>
<body>
    <div class="div">
        <form modelAttribute="user" method="post" action="register">
            <br/>
            ${message}
            <h1 align="center">Register</h1>
            <table>
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
</body>
</html>
