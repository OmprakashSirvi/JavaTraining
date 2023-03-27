<!-- @format -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1" />
      <title>login</title>
   </head>
   <body>
      <a href="/">home</a> <br />
      <a href="/register">register</a>
      <br />
      <h1>Login page</h1>
      <br />

      <form action="login" method="post">
         username(email) :
         <input type="email" name="email" required /><br /><br />
         password :
         <input type="password" name="password" required /><br /><br />
         <input type="submit" value="login" />
      </form>
   </body>
</html>
