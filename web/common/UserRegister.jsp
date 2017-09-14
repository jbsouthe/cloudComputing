<%-- 
    Document   : LoginCheck
    Created on : Sep 14, 2017, 3:56:37 PM
    Author     : john.southerland
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
<head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>You won't see this page long</title> 
</head> 
<body> 
<% 
    String username=request.getParameter("username"); 
    String password1=request.getParameter("password1"); 
    String password2=request.getParameter("password2");
    String email=request.getParameter("email");
    //TODO test to see if username is already registered and fail if it is
    if( password1.equals(password2) ) { 
        //TODO create the user in the database and continue to app
        session.setAttribute("username",username); 
        response.sendRedirect("welcome.jsp"); 
    } else 
        response.sendRedirect("Login.jsp"); 
%> </body> </html>