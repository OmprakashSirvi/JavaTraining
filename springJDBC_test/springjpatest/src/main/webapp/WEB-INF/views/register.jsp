<!-- @format -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1" />
      <title>Register</title>
   </head>
   <body>
      <a href="/">home</a><br />
      <a href="/login">login</a><br />
      <h1>register here</h1>
      <br />

      <form action="register" method="post">
         email : <input type="email" name="email" required /><br /><br />
         first name :
         <input type="text" name="firstName" required /><br /><br />
         last name : <input type="text" name="lastName" /><br /><br />
         Password :
         <input type="password" name="password" required /><br /><br />
         gender name :
         <fieldset>
            <input type="radio" name="gender" value="male" /><label for="male"
               >male</label
            >
            <input type="radio" name="gender" value="female" />
            <label for="female">female</label><br /><br />
         </fieldset>
         date of birth : <input type="date" name="dateOfBirth" /><br /><br />
         user_type : <input type="text" name="userType" /><br /><br />
         location : <input type="text" name="location" /><br /><br />

         <input type="submit" value="register" />
      </form>
   </body>
</html>
