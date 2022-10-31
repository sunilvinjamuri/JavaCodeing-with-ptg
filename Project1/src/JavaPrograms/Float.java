 package JavaPrograms;
import java.util.Scanner;
public class Float {
	public static int add()
	{
		float a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		a=sc.nextFloat();
		b=sc.nextFloat();
		c=a+b;
		System.out.println(c);
		return (int)c;
		
	}
	

	public static void main(String[] args) 
	{
		Float.add();
		

	}

}
