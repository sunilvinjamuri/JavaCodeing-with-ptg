package MavenSqlTesater;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import MavenSql.Empolyee;



public class setAdd {

	public static void main(String[] args) {

		ArrayList<Empolyee> arrayList=new ArrayList();
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
	//	System.out.println("connection is Sucess:"+connection);
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("SELECT * FROM student.`emp-detl`");
		int i=11;
		while(set.next())
		{
			MavenSql.Empolyee e=new MavenSql.Empolyee(set.getInt(1),set.getString(2),set.getString(3),set.getString(4));
					
			
			 i++;
			arrayList.add(e);
		}
		for(MavenSql.Empolyee e:arrayList)
		{
			System.out.println(e.getName()+" "+e.getAdd()+" "+e.getId()+" "+e.getZip());
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.printStackTrace();
		
		}
		

	
	}

}
