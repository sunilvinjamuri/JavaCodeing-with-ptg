package p5;

	import java.sql.Connection;
	import java.sql.DriverManager;
	public class GetConnection {
	    public static Connection getConnection()
	    {
	        Connection connection=null;
	        try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	         connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	        }catch(Exception e) {
	            e.printStackTrace();
	        }
	     return connection;
	    }





	}


