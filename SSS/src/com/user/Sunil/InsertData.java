package com.user.Sunil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			//	System.out.println("connection is Sucess:"+connection);
				Statement statement=connection.createStatement();
				String quary="insert into student_details values(6,'manjula',44,55,66)";
				
				statement.executeUpdate(quary);
				System.out.println("Data inserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
