package JavaPrograms;
import java.util.Scanner;
public class hotelRooms 
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

	public void show()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Avalible in Hotels");
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
 		public int View()
 		
 		{ 
 			System.out.println(" Welcome to Vegitable Market");
 			System.out.println("1 Brinjals\n 2 Tomato 3 Potato");
 			System.out.println("Please enter the choice?");
 	 		System.out.println("---------------------------------------------------------");
 			int age, Persons;
 		Scanner sc=new Scanner(System.in);
 			System.out.println("Enter the Age");
 			age=sc.nextInt();
 			System.out.println("enter the No of persons");
 			Persons=sc.nextInt();
 			
 			if(age>10)
 				
 			{
 				System.out.println("It will the Charge");
 			}
 			
 			else
 			{
 				System.out.println("It will the  not Charge");
 			}
 			return age;
 				}
 			
 		
	

	public static void main(String[] args) 
	{
		
		
		hotelRooms  aobj=new hotelRooms ();
		aobj.View();
		//aobj.show();
		aobj.hotel1(1);
		
		
	}

}
