	package com.java.Programes;
	import java.util.HashMap;
	import java.util.Map;

	//Class 1
	//An immutable class
	final class Empname {

		// Member attributes of final class
		private final String Empname;
		private final int Empid;
		private final Map<String, String> metadata;

		// Constructor of immutable class
		// Parameterized constructor
		public Empname(String Empname, int Empid,
					Map<String, String> metadata)
		{

			// This keyword refers to current instance itself
			this.Empname = Empname;
			this.Empid = Empid;

			// Creating Map object with reference to HashMap
			// Declaring object of string type
			Map<String, String> tempMap = new HashMap<>();

			// Iterating using for-each loop
			for (Map.Entry<String, String> entry :
				metadata.entrySet()) {
				tempMap.put(entry.getKey(), entry.getValue());
			}

			this.metadata = tempMap;
		}

		// Method 1
		public String getEmpName() { return Empname; }

		// Method 2
		public int getEmpid() { return Empid; }

		// Note that there should not be any setters

		// Method 3
		// User -defined type
		// To get meta data
		public Map<String, String> getMetadata()
		{

			// Creating Map with HashMap reference
			Map<String, String> tempMap = new HashMap<>();

			for (Map.Entry<String, String> entry :
				this.metadata.entrySet()) {
				tempMap.put(entry.getKey(), entry.getValue());
			}
			return tempMap;
		}
	}

	//Class 2
	//Main class
	class Empdata {

		// Main driver method
		public static void main(String[] args)
		{
			//Empname aobj=new Empname(null, 0, null);
			

			// Creating Map object with reference to HashMap
			Map<String, String> map = new HashMap<>();

			// Adding elements to Map object
			// using put() method
			map.put("5395", "Sunil");
			map.put("5394", "Shravan");
			map.put("5391", "Rohan");
			map.put("5399", "Poojitha");

			Empname e = new Empname("Sunil", 5395, map);
			e.equals(5395);
			

			// Calling the above methods 1,2,3 of class1
			// inside main() method in class2 and
			// executing the print statement over them
			System.out.println(e.getEmpName());
			System.out.println(e.getEmpid());
			System.out.println(e.getMetadata());

			// Uncommenting below line causes error
			// s.regNo = 102;

			map.put("5378", "Usha");
			// Remains unchanged due to deep copy in constructor
			System.out.println(e.getMetadata());
			e.getMetadata().put("5398", "Deepika");
			// Remains unchanged due to deep copy in getter
			System.out.println(e.getMetadata());
		}
	}


	

