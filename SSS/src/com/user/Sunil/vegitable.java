package com.user.Sunil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class vegitable {

	public static void main(String[] args)
	{
		int total[]=new int[6];
		String[] name=new String[6];
		int i=0;
		int amount,amt = 0;
		int kg=0;
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/vegitables","root","root");
	//	System.out.println("connection is Sucess:"+connection);
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("select *from vegitables_details");
		while(rs.next())
		{
			 name[i]=rs.getString(2);
			 total[i]=rs.getInt(3)+getInt(4);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			i++;
			amount=kg*amt;
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
