package com.java.Programes;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;




class Employyee{              //singleton class
   private String e_name;
   private int e_id;
   private  static Employyee e=null;
   private Employyee()
   {
       
   }
   public static Employyee getInstance()//getInstance method
   {
      if(e==null){
           e=new Employyee();
       }
       return e;
}
    public String getE_name() {
        return e_name;
    }
    public void setE_name(String e_name) {
        this.e_name = e_name;
    }
    public int getE_id() {
        return e_id;
    }
    public void setE_id(int e_id) {
        this.e_id = e_id;
    }
}
final public class Main {           //immutable class
    public static void main(String[] args) {



       Employyee employyee=Employyee.getInstance();//factory method to call Employyee(singleton) class
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,String> hashmap=new HashMap<>();
        while(true){
        System.out.println("1.add\n2.display\n3.clear\n0.stop to add or exit");//enter 0 to stop adding the details and also enter 0 to exit program.
        int choice=sc.nextInt();
        if(choice==1){
        System.out.println("enter the employee id and employee name");//input from user
        while (true) {
            int m_id=sc.nextInt();
            if(m_id==0)
                break;
            else{
              String m_name=sc.next();
              employyee.setE_id(m_id);
              employyee.setE_name(m_name);
              hashmap.put(employyee.getE_id(),employyee.getE_name());//doesnot allow duplicate elements(keys)
            }
         
        }
       
        }
        else if(choice==2){//display the employee details
            System.out.println("the employee details");
           for (Map.Entry<Integer, String> set : hashmap.entrySet()){
               System.out.println("          "+set.getKey() + " => " + set.getValue());
           }
               
        }
        else if(choice==3){
            System.out.println("1.delete \n 2.delete all");
            int choice_d=sc.nextInt();
            if(choice_d==1){
                System.out.println("enter the id to delete");//delete --->to delete the single employee details.
                int choice_i=sc.nextInt();
                hashmap.remove(choice_i);
                System.out.println("after deleting"+ hashmap);
            }
            else{
            System.out.println(" all employye details deleted");//deleteall-->to clear all employee details
            hashmap.clear();
                
            }
        }
        else{
            break;
        }
    }
    }
}