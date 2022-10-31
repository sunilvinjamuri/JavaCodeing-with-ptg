package com.java.Programes;

public class ConcatString {


private void Str() 
	{
		String s1="Hyederabad ";
		String s2=" It is a beautiful place";
		String s =s1.concat(s2);
		System.out.println(s);
		
	}
	

	public static void main(String[] args) 
	{
		ConcatString aobj=new ConcatString();
		aobj.Str();
	}

}