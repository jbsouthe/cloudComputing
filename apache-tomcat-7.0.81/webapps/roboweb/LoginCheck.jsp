<%-- 
    Document   : LoginCheck
    Created on : Sep 14, 2017, 3:56:37 PM
    Author     : john.southerland
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<html> 
<head> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
        <title>JSP Page</title> 
</head> 
<body> 
<% 
    String username=request.getParameter("username"); 
    String password=request.getParameter("password"); 
    if(( !password.endsWith("nope"))) { 
        session.setAttribute("username",username); 
        response.sendRedirect("welcome.jsp"); 
    } else 
        response.sendRedirect("Login.jsp"); 
%> </body> </html>
