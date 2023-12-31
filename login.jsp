<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
        <h1>Login</h1>
        <form action="login" method="post"> <!-- Change method to "post" -->
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Login</button>
        </form>

        <p><a href="index.html">Back to Home</a></p>
        
          
        <%-- Display error message if login fails --%>
        <%
          if(request.getAttribute("error")!=null){ %>
        	  <p style="color: red;">Invalid username or password. Please try again.</p>
          <%}%>
        
    </div>
</body>
</html>