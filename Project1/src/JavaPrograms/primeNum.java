package JavaPrograms;
import java.util.Scanner;
public class primeNum {

	public static void main(String[] args)  
	{
		int num,i,usha=0,c=0;
		System.out.println("please enter your number to test");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=2;i<num-1;i++)
		{
		if(num%i==0)
		{
			usha=1;
			break;
		}
		if(usha==1)
		{
			System.out.println("this is a  not prime number");

		}
		else
		{
			System.out.println("this is a  prime number");

		}
		
	
		sc.close();
	}
	}
}



