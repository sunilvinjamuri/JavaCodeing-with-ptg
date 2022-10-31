package JavaPrograms;

import java.util.Scanner;
public class Groceries 
{
	double amt=0,b=0;
	Scanner sc=new Scanner (System.in);
	 public void meth1(int a)  {
		 if(a==101) {
			 float slk = 100;
			 float avl;
			 System.out.println("Lady Fingers is a good choice Avalible in 100kgs...");
			System.out.println("Enter  no of kg's: ");
			 int kg = sc.nextInt();
			 avl=slk-kg;
			 System.out.println("Avalible Stock "+avl);
			
			 int m=kg*50;
			 System.out.println("Lady fingers Bill:"+m);
			 amt=amt+m;
		 }
		 if(a==201) 
		 {
			 float sck=150;
			 float avl;
			 System.out.println("Carrot is a good choice Avalible in 150kgs...");
				System.out.println("Enter   no of kg's: ");
				 int kg = sc.nextInt();
				 System.out.println("-----------------------------");
				 avl=sck-kg;
				 System.out.println("Avalible Stock "+avl);
				 int c=kg*41;
				 System.out.println("Carrot Bill:"+c);
				 amt=amt+c;
		 }
		 if(a==301) 
		 {
			 float stk=250;
			 float ctk=0;
			 float avl;
				 System.out.println("Tamato is a good choice Avalible in 250kgs...");
					System.out.println("Enter  no of kg's: ");
					 int kg = sc.nextInt();
					 System.out.println("-----------------------------");
					 avl=stk-kg;
					 System.out.println("Avalible Stock "+avl);
					 int t=kg*29;
					 System.out.println("Tomato Bill:"+t);
					 amt=amt+t;
		 }
		 if(a==401) 
		 {
			 float spk=300;
			 float cpk=0;
			 float avl;
			 System.out.println("Potato is a good choice Avalible in 300kgs...");
				System.out.println("Enter   no of kg's: ");
				 int kg = sc.nextInt();
				 System.out.println("-----------------------------");
				 avl=spk-kg;
				 System.out.println("Avalible Stock "+avl);
				 int p=kg*49;
				 System.out.println("Potato Bill:"+p);
				 amt=amt+p;
		 }
		
		 
	 }
     public void display() {
    	 System.out.println("============ Welcome to Organic Stores =======");
 		System.out.println("------------------------------------------------------");
 		System.out.println("Avalible products in the store");
 		System.out.println(" 1 Lady Fingers \n 2 Carrot \n 3 Tomato \n 4 Potato");
 		System.out.println("Please enter the choice?");
 		System.out.println("---------------------------------------------------------");
 		int choice=sc.nextInt();
 		if (choice==1) {
			System.out.println("101------Lady Fingers------1kg is 50");
			
			
			int a = sc.nextInt();
			meth1(a);
		}
 		switch(choice) {
 		case 2:
 			System.out.println("201---------- Carrot----1kg is 41");
 			
 			int a = sc.nextInt();
			
 			meth1(a);
 		}
 		switch(choice) 
 		{
 		case 3:
 			System.out.println("301---------Tomato----1kgis 29");
 			
 			int a = sc.nextInt();
			meth1(a);
 		}
 		switch(choice)
 		{
 		case 4:
 			System.out.println("401---------Potato----1kg is 49");
 			
 			int a = sc.nextInt();
			meth1(a);
 		}
 		switch(choice)
 		{
 		case 5:
 		
 			System.out.println("invalid");
 		}
 		System.out.println("if you want shopping press 1");
		System.out.println("if you dont  want shopping press 2");
		int b=sc.nextInt();
		if (b==1)
			display();
		if (b==2)
		{
			System.out.println(" Before disscount total bill "+amt);
			if (amt>=5000) {
				double dis =(amt/100)*5;
				amt=amt-dis;
			System.out.println("After disscount final total bill "+amt);
			}
			}
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		Groceries aobj =new Groceries();
		aobj.display();
		System.out.println("==================Thank you for shopping=========================");
		System.out.println("===================JAVA IS AWESOME===============================");
	}
}
