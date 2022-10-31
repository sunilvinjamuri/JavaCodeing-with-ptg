package collectionDBs;


	import java.sql.Array;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.util.ArrayList;

	import dbconnection.Btech;

	public class getBtech 
	{
		

		public static void main(String[] args)
		{
			ArrayList<Btech> arrayList=new ArrayList();
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		//	System.out.println("connection is Sucess:"+connection);
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM student.btech");
			
			while(set.next())
			{
				Btech e=new Btech();
						
				 e.setName(set.getString(2));
				 e.setId(set.getInt(1));
				 e.setCourse(set.getString(3));
				e.setDept(set.getString(4));
				 e.setMarks(set.getInt(5));
				 
				arrayList.add(e);
			}
			for(Btech e:arrayList)
			{
				System.out.println(e.getId()+" "+e.getName()+" "+e.getCourse()+" "+e.getMarks()+" "+e.getDept());
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
				//e.printStackTrace();
			
			}
		}
			

}
