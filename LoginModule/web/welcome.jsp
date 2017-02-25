<%-- 
    Document   : welcome
    Created on : Feb 23, 2017, 11:55:40 PM
    Author     : neodze
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
            <% 
                 if(session.getAttribute("username") == null){
                     response.sendRedirect("login.jsp");
                 }
            %> 
        
        <h1> Welcome! ${username} </h1>
        <a href="videos.jsp">Videos</a>
        
        <form action="logout">
            <input type ="submit"  value="logOut">
        </form>
    </body>
</html>
