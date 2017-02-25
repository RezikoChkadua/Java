<%-- 
    Document   : videos
    Created on : Feb 23, 2017, 11:56:00 PM
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
        
        <h1>Here is The Video</h1>
    </body>
</html>
