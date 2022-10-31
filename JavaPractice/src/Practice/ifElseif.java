package Practice;
import java.util.Scanner;
public class ifElseif
{

	public static void main(String user_input[] ) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the user amount");
		int amount=scan.nextInt();
		
		if(amount>=1000)
		{ 
			amount=amount-500;
		}
		else if(amount>=500)
		{
			amount=amount-100;
		}
		else if(amount>=100)
		{
			amount=amount-50;
		}
		else
		{
			System.out.println("no discount");
		}
		System.out.println("User total amount:"+amount);
		
		
	}

}
