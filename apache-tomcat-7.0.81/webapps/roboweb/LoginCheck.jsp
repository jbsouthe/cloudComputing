<%-- 
    Document   : LoginCheck
    Created on : Sep 14, 2017, 3:56:37 PM
    Author     : john.southerland
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%
        ResultSet resultset = null;
%>

<body> 
<% 
    String username=request.getParameter("username"); 
    String password=request.getParameter("password"); 

    String connectionURL = "jdbc:mysql://192.168.1.218:3306/robocode";
    Class.forName("com.mysql.jdbc.Driver").newInstance();
    Connection connection = DriverManager.getConnection(connectionURL, "root",
                                                        "root");

    Statement statement = connection.createStatement();
    String selectString="SELECT userid from roles where userid='"+username+"'";
resultset = statement.executeQuery(selectString);
	if(resultset.next()){
	        session.setAttribute("username",username); 
        	response.sendRedirect("welcome.jsp"); 
	}
     else 
        {response.sendRedirect("LoginFail.jsp");} 
%> </body> </html>
