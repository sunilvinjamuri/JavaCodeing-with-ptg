package com.java.add;

public class main {

	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
