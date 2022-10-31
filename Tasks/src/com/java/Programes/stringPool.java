package com.java.Programes;
import java.security.PublicKey;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;


public class stringPool
{
	public  void meth1()
	{
		        String Name;
		        String Dept;
		        float Salary;
		        
		         System.out.println("immplementation of Hashmap");
		         HashMap map=new HashMap();
		         map.put(5395,"Sunil");
		         map.put("Sunil",20000);
		         map.put(null,"null");
		         map.put(5398,"Poojitha");
		         map.put(5394,"Shravan");
		         System.out.println(map);
		         System.out.println(map.put(5398, "Sunil"));
		        
		         
		         System.out.println(map.get(5394));
		         
		         
		         System.out.println("==========================================");
		         System.out.println("retriving the data from Hashset");
		         HashSet LHS = new HashSet(map.keySet());
		         
		         System.out.println("HashSet:"+LHS);
		         
		         System.out.println(" --------------------------------------------");
		         LinkedHashSet RHS=new LinkedHashSet(map.entrySet());
		         System.out.println("linkedHashSet:"+RHS);
		         System.out.println("------------------------------------------------");
		         HashSet hs2=new HashSet(map.entrySet());
		         Iterator i=hs2.iterator();
	         System.out.println(i.next());
		         while(i.hasNext())
		         {
		         System.out.println(i.next());
		        Entry e=(Entry)i.next();
		         System.out.println(e.getKey()+" "+e.getValue());
		         }
		         System.out.println("");
		         
	}
		         
		         
	

	//private Collection map() {
		
		//return null;
	
	public static void main(String []args)
	{
		stringPool aobj=new stringPool();
		aobj.meth1();
		
		
	}
}
		
	

