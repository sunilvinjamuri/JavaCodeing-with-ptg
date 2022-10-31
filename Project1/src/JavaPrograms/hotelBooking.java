package JavaPrograms;

import java.util.Scanner;

public class hotelBooking 
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
		Scanner sc=new Scanner(System.in);
		System.out.println("Avalible in Hotels");
		//System.out.println("1 Mumbai\n 2 Shimla");
		System.out.println("1 5Star\n 2 Sitara");
		System.out.println("Please enter the choice?");
 		System.out.println("---------------------------------------------------------");
 		System.out.println("11------Ac Room is 3000");
		System.out.println("22------Non-Ac Room is 2500");
		System.out.println("----------------------------------------------------------------");
		System.out.println("101------Ac Room is 3000");
		System.out.println("202------Non-Ac Room is 2500");
		int choice=sc.nextInt();
 		if (choice==1)
 		 {
			System.out.println("11------Ac Room is 3000");
			System.out.println("22------Non-Ac Room is 2500");
			System.out.println("Enter your code: ");
			System.out.println("----------------------------------------------------------------");
			int a = sc.nextInt();
			hotel1(a);
 		 }
 		else if (choice==2)
 		 {
			System.out.println("101------Ac Room is 3000");
			System.out.println("202------Non-Ac Room is 2500");
			System.out.println("Enter your code: ");
			System.out.println("----------------------------------------------------------------");
			int a = sc.nextInt();
			hotel1(a);
 		 }
	}
 		

	public void show()
	{

			System.out.println(" Welcome to");
			System.out.println("1 Mumbai\n 2 Shimla");
			System.out.println("Please enter the choice?");
	 		System.out.println("---------------------------------------------------------");
	 		int age, Persons,n=80;
	 		Scanner sc=new Scanner(System.in);
	 			System.out.println("1 Mumbai\n 2 Shimla");
	 			System.out.println("Please choose the choice?");
		 		System.out.println("---------------------------------------------------------");
	 			age=sc.nextInt();
	 			System.out.println("please enter the age");
	 			age=sc.nextInt();
	 			
	 			if(age>12)
	 			{
	 				System.out.println("It will the provie the room");
	 			}
	 			
	 			else
	 			{
	 				System.out.println("It will the  not provide the room");
	 			}
	 			}
	 			public void fix()
	 			{
	 				
	 	             int n=3;
	 				Scanner sc=new Scanner(System.in);
	 				System.out.println("Enter the no of person's");
	 				n=sc.nextInt();
	 				if(n<=2) 
	 				{
	 					System.out.println("In a single  it will Allows only 2 members");
	 				}
	 				else
	 				{
	 					System.out.println("In a single  it will not Allows more than 2 members");
	 				}
	 				

	}
	public static void main(String[] args) 
	{
		hotelBooking aobj=new hotelBooking();
		aobj.show();
		aobj.fix();
		aobj.view();
		aobj.hotel1(1);
		
	}

}
