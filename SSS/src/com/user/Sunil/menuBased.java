package com.user.Sunil;
import java.util.Scanner;
public class menuBased {

	public static void main(String[] args) {
		System.out.println("what yoo want to perform?");
		System.out.println("1--> Display");
		System.out.println("2--> Insert");
		System.out.println("3--> Delete");
		System.out.println("4--> Update");
		int choice;
		Scanner sc=new Scanner(System.in);
		choice =sc.nextInt();
		if(choice==1)
		{
			studentprintDb.displayData();
		}
		else if(choice==2)
		{
		InsertValuesinDB.insertData();
				
		
	}

}
}
