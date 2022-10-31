package p2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//import java.sql.*;

import p1.ConnectionFactory;

public class Employeeservice implements EmployeeDao
{

	public void AddEmployee(Employee employee) {
		try
		{
			
			
			Connection connection = ConnectionFactory.getConnection();
			
			Statement statement = connection.createStatement();
			
			
		    statement.executeUpdate("insert into login(`id`,`name`) values('"+ employee.getId()+"',"+employee.getUsername());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

	@Override
	public void DisplayEmployee() {
		Connection connection = ConnectionFactory.getConnection();
		
		try {
			Statement statement = connection.createStatement();
			ResultSet re =statement.executeQuery("select * from login");
			while (re.next()) {
				System.out.println(re.getInt(1));
				System.out.println(re.getString(2)); 
				//System.out.println(re.getString(3));
				//System.out.println(re.getString(4));
				//System.out.println(re.getString(5));
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
	}

	 

	public void UpdateEmployee() 
	{
		Connection connection = ConnectionFactory.getConnection();
		Scanner scanner= new Scanner(System.in);
		System.out.println("please eneter id");
		int id =scanner.nextInt();
		System.out.println("please new name");
		String a=scanner.next();
		
		try
		{
			Statement statement = connection.createStatement();
			 statement.executeUpdate("UPDATE `student`.`login` SET `name` = '"+a+"' WHERE (`id` = '"+id+"');");
			System.out.println("updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteEmployee(Employee emp) {
		Connection connection = ConnectionFactory.getConnection();
	try
	{
		Statement statement = connection.createStatement();
		statement.executeUpdate("delete from `student`.`login` where id='"+emp.getId()+"'");
		System.out.println("deleted");
		
		
	}catch(Exception e)
	{
		System.out.println(e);
	}
		
	}

	@Override
	public void UpdateEmployee(Employee employee) {
		
		
	}

	
	
}