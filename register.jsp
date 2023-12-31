<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
        <h1>Register</h1>
        <form action="register" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="email">Email:</label>
            <input type="text" id="username" name="email" required><br>   
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Register</button>
        </form>
    
        <p><a href="index.html">Back to Home</a></p>
    
        <%
          if(request.getAttribute("success")!=null){ %>
          <p style="color: green;">Registration successful.</p>
        <% }%>
                <%-- Display error message if registration fails --%>
        
        <%
          if(request.getAttribute("error")!=null){%>
          <p style="color: red;">Registration failed. Please try again.</p>
        <% } %>
        
      </div>
</body>
</html>