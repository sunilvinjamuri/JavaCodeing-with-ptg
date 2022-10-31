package JavaPrograms;

import java.util.Scanner;

public class hotelBookingEnd
{

	public void hotel1(int a)
	{
		float price;
		Scanner sc=new Scanner(System.in);
		 if(a==11) {
			 System.out.println("Your room is booked"); 
		 }
		 else if(a==22) {
			 System.out.println("Your room is booked"); 
		 }		
		 else if(a==101) {
			 System.out.println("Your room is booked"); 		 }		
		 else if(a==202) {
			 System.out.println("Your room is booked"); 
		 }	
		 
	
		else
		 {
			 System.out.println("choose the correct choice:");
		 }
		 }
	public void view()
	{ 
		
		int choose=1;
		int choose2=2;
		if (choose==1)
		 {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Benguluru");
			
			System.out.println("11------Ac Room is 3000");
			System.out.println("22------Non-Ac Room is 2500");
			System.out.println("Enter your code: ");
			System.out.println("----------------------------------------------------------------");
			int a = sc.nextInt();
			hotel1(a);
		 }
		else if (choose2==2)
		 {
			Scanner sc=new Scanner(System.in);
			System.out.println("Welcome to Hyderabad");
			System.out.println("101------Ac Room is 3000");
			System.out.println("202------Non-Ac Room is 2500");
			System.out.println("Enter your code: ");
			System.out.println("----------------------------------------------------------------");
			int a = sc.nextInt();
			hotel1(a);
		 }
		else
		{
			System.out.println("choose the correct Choise");
		}
	}
		
	
	public void show()
	{
	System.out.println(" Have a nice day");
	System.out.println("1 Bengulure\n 2 Hyderabad");
	System.out.println("Please enter the choice?");
		System.out.println("---------------------------------------------------------");
	}

	public static void main(String[] args) {
		hotelBookingEnd aobj=new hotelBookingEnd();
		aobj.show();
		aobj.view();
		aobj.hotel1(1);
		
		
	}

}
