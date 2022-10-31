package com.user.Sunil;

import java.util.EventObject;

public class objectData
{
	public objectData  view()
	{
		int a,b,c;
		a=11;
		b=99;
		c=a*b;
		System.out.println(c);
		return this;
	}
	

	public static void main(String[] args) 
	{
		objectData B=new objectData();
		B.view();
		
		

	}

}
