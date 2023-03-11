<!-- @format -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1" />
      <title>Edit movie</title>
   </head>
   <body>
      <form action="editMovie">
         Movie Name :
         <input type="text" name="movieName" /><br /><br />
         Language:
         <select name="language">
            <option value="English">English</option>

            <option value="Hindi">Hindi</option>

            <option value="Others">Others</option></select
         ><br /><br />
         Director : <input type="text" name="director" /><br /><br />
         <input type="submit" value="Update Movie" />
      </form>
   </body>
</html>
