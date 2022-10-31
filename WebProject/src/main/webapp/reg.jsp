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
String u=request.getParameter("un");
String pwd=request.getParameter("pwd");
String a=request.getParameter("add");
String z=request.getParameter("zip");
//System.out.println(u);
//out.println(pwd);
try
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
PreparedStatement statement = connection.prepareStatement("insert into login values(?,?,?,?)");
statement.setString(1, u);
statement.setString(2, pwd);
statement.setString(3, a);
statement.setString(4, z);
int i=statement.executeUpdate();
if(i>0)
{
	response.sendRedirect("login.html");
}
}
catch(Exception e)
{
	System.out.println(e);
	//e.printStackTrace();

}
	






%>

</body>
</html>