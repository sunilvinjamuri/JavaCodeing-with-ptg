package JavaPrograms;
import java.util.Scanner;
public class Exception 
{

	
	

	public static void main(String[] args) 
	{

		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values");
		try
		{
			
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=a*b;
		System.out.println(c);
		}
		finally
		{
			System.out.println("It's completed");
		}
		
		
		

	


	}
}

