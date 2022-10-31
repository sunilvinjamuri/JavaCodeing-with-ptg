package JavaPrograms;
import java.util.Scanner;
public class Anagrams 
{
	public void m1()
	{
		String str1="SHORE";
		String str2="HORSE";
	
		Scanner sc=new Scanner(System.in);
		Object s = null;
		System.out.println("enter your string");
	    s=sc.next();
	    System.out.println("enter your string");
	    s=sc.next();
		
		
	
	if(s != null)
	{
		System.out.println("It is a Anagram");
		
	}
	else
	{
		System.out.println("It is  not a Anagram");
	}
	}
	
	public void m2()
	{
		
	
		Scanner sc=new Scanner(System.in);
		Object s = null;
		System.out.println("enter your string");
	    s=sc.next();
	    System.out.println("enter your string");
	    s=sc.next();
	    
		String str1="SCHOOL MASTER";
		String str2="THE CLASSROOM";
	
		
	
	if(str1 != null)
	{
		System.out.println("It is a Anagram");
		
	}
	else
	{
		System.out.println("It is  not a Anagram");
	}
	}
	public void m3()
	{
		

		Scanner sc=new Scanner(System.in);
		Object s = null;
		System.out.println("enter your string");
	    s=sc.next();
		String str1="NOTE";
		String str2="KNOT";
	
		
	
	if(s != null)
	{
		System.out.println("It is not a Anagram");
		
	}
	
	}


	public static void main(String[] args)
	{
		Anagrams a=new Anagrams();
		a.m1();
		a.m2();
		a.m3(); 
	}

}

