package collectionDBs;

import java.sql.Array;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import dbconnection.Empolyee;

public class setAdd 
{
	

	public static void main(String[] args)
	{
		ArrayList<Empolyee> arrayList=new ArrayList();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	//	System.out.println("connection is Sucess:"+connection);
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("SELECT * FROM student.`emp-detl`;");
		
		while(set.next())
		{
			Empolyee e=new Empolyee();
					
			 e.setName(set.getString(2));
			 e.setId(set.getInt(1));
			 e.setAdd(set.getString(3));
			 e.setZip(set.getString(4));
			arrayList.add(e);
		}
		for(Empolyee e:arrayList)
		{
			System.out.println(e.getId()+" "+e.getName()+" "+e.getAdd()+" "+e.getZip());
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();
		
		}
		

	
	}

}
