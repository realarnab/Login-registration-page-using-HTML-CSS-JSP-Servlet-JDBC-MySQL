<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
<linK rel="stylesheet" href="indexStyle.css">
</head>
<body>
 <%
        // Retrieve the session object
        HttpSession session1 = request.getSession(false);

        // Check if the session is not null and the username attribute is set
        if (session != null && session.getAttribute("username") != null) {
            // Get the username from the session
            String username = (String) session.getAttribute("username");
    %>
<div class="container">
        <h1>Welcome, <%=username %></h1>
        <p>We're delighted to have you on our platform.</p>
        <h3>Explore, learn, and connect with our vibrant community!</h3>
        <p>Feel free to stay as long as you like, and when you're ready,</p> 
        you can <a href="logout">LOGOUT</a> securely.
    </div>
    <% } %>
</body>
</html>