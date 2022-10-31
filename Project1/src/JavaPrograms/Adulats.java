package JavaPrograms;
import java.util.Scanner;
public class Adulats extends hotelRooms 
{
	public void view()
	{ int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Age");
		age=sc.nextInt();
		if(age>10)
			for(int i=10;i<=age;i++)
		{
			System.out.println("It will the Charge");
		}
		
		else
		{
			System.out.println("It will the  not Charge");
		}
	}

}
