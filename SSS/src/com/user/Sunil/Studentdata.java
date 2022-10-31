package com.user.Sunil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Studentdata {

	public static void main(String[] args)
	{
		int total[]=new int[6];
		String[] name=new String[6];
		int i=0;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	//	System.out.println("connection is Sucess:"+connection);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("select *from student_details");
		while(rs.next())
		{
			 name[i]=rs.getString(2);
			 total[i]=rs.getInt(3)+getInt(4);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
			i++;
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		
		}
		

	
	}

	private static int getInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
