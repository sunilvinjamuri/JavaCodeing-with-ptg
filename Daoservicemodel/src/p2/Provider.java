package p2;
import java.util.Scanner;
public class Provider
{
	public static void addData()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your name password");
		//System.out.println("enter your Address zip ");
		Employee employee=new Employee();
		employee.setUsername(scanner.next());
		//employee.setPassword(scanner.next());
		//employee.setAdd(scanner.next());
		//employee.setZip(scanner.next());
		Employeeservice service=new Employeeservice();
		service.AddEmployee(employee);
		System.out.println("Data inserted..!!!");
		service.DisplayEmployee();
		
		
	}
	public static void updateData()
	{
	
		Employeeservice service=new Employeeservice();
		service.UpdateEmployee();
	}
	
	public static void deleteD()
	{
		Scanner sc= new Scanner(System.in);
		Employee emp = new Employee();
		System.out.println("enter id");
		emp.setId(sc.nextInt());
		Employeeservice empD= new Employeeservice();
		empD.deleteEmployee(emp);
		
	}
	
	public static void main(String[] args)
	{ 
		Provider.addData();
		
		Provider.deleteD();
		Provider.updateData();
	}

}
