package Practice;
import java .util.Scanner;
public class Switchcase {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Enter your the number");
		i=sc.nextInt();
		switch(i)
		{
		case 1:
		{
			System.out.println("Hello World");
			//break;
		}
		case 2:
		{
			System.out.println("Hello india");
			//break;
		}
		case 3:
		{
			System.out.println("Hello Andhra Pradesh");
			//break;
		}
		case 4:
		{
			System.out.println("Hello Guntur");
			//break;
		}
		case 5:
		{
			System.out.println("Hello Gurazala");
			//break;
		}
		case 6:
		{
			System.out.println("Hello Gangavaram");
			//break;
		}
		case 7:
		{
			System.out.println("Hello Sunil");
			break;
		}
		default:
			System.out.println("Invalid input");
		}
		

	}

}
