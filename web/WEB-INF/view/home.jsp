<%--
  Created by IntelliJ IDEA.
  User: Madhu
  Date: 6/28/2020
  Time: 10:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>WelCome</title>
    <style>
      div{
          text-size:30px;
          background-color: #FFA500;
          text-align:center;
          width: 300px;
          padding: 100px;
          margin: 20px;
          display: inline-block;
          position: absolute;
          left: 50%;
          top:20%;
          transform: translate(-50%, -50%);
      }
    </style>
  </head>
  <body>
    <div>
      <br>
      <h1>Welcome</h1><br>
      <form method="get" action="register-page">
          <input style="font-family:verdana,serif" type="submit" value="Register" />
      </form>
      <br>
      <form method="get" action="login-page">
        <input style="font-family:verdana,serif" type="submit" value="Login" />
      </form>
    </div>
  </body>
</html>
