<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>home</title>
    <style>
      <%@include file="/WEB-INF/view/style.css"%>
    </style>
  </head>
  <body>
  <%
      response.setHeader("cache-control","no-cache,no-store");
  %>
    <div class="div">
      <br/>
          ${message}
          <h1>Welcome</h1>
          <form method="get" action="register-page">
            <input style="font-family:verdana,serif" type="submit" value="Register" />
          </form>
      <br/>
          <form method="get" action="login-page">
            <input style="font-family:verdana,serif" type="submit" value="Login" />
          </form>
      <br/>
    </div>
  </body>
</html>
