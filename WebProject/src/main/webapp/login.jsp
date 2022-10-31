<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String u = request.getParameter("un");
String pwd = request.getParameter("pwd");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from login where name='"+u+"' and password = '"+pwd+"'");
if(rs.next())
{
	response.sendRedirect("welcome.jsp");
}
else
	out.println("Invalid login Details\n");	
	out.println("<a href='login.html'>Login Again</a>");
%>
</body>
</html>