<!-- @format -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%> <%@ taglib uri="http://java.sun.com/jsp/jstl/core"
prefix="c" %>
<!DOCTYPE html>
<html>
   <head>
      <meta charset="ISO-8859-1" />

      <title>Movies</title>
   </head>
   <body>
      <div>
         Search for movies : <input type="text" name="moviename" /> <br />
         <input type="submit" value="search" /> <br />
      </div>

      <div>
         <a href="viewMoviesByLang?lang=English">English</a>
         <a href="viewMoviesByLang?lang=Hindi">Hindi</a>
         <a href="viewMoviesByLang?lang=Others">Others</a>
      </div>
      <div>
         <table>
            <tr>
               <th>Movie name</th>
               <th>Movie Language</th>
               <th>Movie Director</th>
            </tr>
            <c:forEach items="${movies}" var="movie">
               <tr>
                  <td>${movie.movieName}</td>
                  <td>${movie.language}</td>
                  <td>${movie.director}</td>
                  <td><a href="editMovie?id=${movie.movieId}">Edit</a></td>
                  <td><a href="deleteMovie?id=${movie.movieId}">Delete</a></td>
               </tr>
            </c:forEach>
         </table>
      </div>
   </body>
</html>
