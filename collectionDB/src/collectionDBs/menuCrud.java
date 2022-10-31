package collectionDBs;

import java.util.Scanner;
import java.sql.*;
public class menuCrud
{
   public  static void add()
   {
       try {
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
       
       Scanner scan=new Scanner(System.in);
       while(true)
       {
           System.out.println("student number");
           int no=scan.nextInt();
           System.out.println("student name");
           String name=scan.next();
       System.out.println("student address");
        String address=scan.next();
        Statement st= con.createStatement();
      String sqlQuery=String.format("insert into stu_dent (`no`, `name`, `address`) values('"+no+"','"+name+"','"+address+"')");
      st.executeUpdate(sqlQuery);
      System.out.println("record inserted successfully");
      System.out.println("do u want to insert one more record[yes/no]");
      String a=scan.next();
      if(a.equalsIgnoreCase("no"))
              {
                 break;
              }
      
          
       
       }
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
   }
   public static void delete()
   {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
           Statement st= con.createStatement();
           System.out.println("enter the student number");
           Scanner scan=new Scanner(System.in);
           int a=scan.nextInt();
           String sqlQuery=String.format("delete from stu_dent where no=%d",a);
           int UpdateCount=st.executeUpdate(sqlQuery);
           System.out.println("the number of rows deleted:"+UpdateCount);
           con.close();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
           
       
   }
   public static void select()
   {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver ");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
           Statement st= con.createStatement();
           
           String sqlQuery=String.format("SELECT * FROM stu_dent.stu_dent");
            ResultSet rs=st.executeQuery(sqlQuery);
          boolean flag=false;
          System.out.println("no/t name/t addt/t");
          System.out.println("-----------");
          while(rs.next())
          {
              flag=true;
              System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
          }
          if(flag==false)
          {
              System.out.println("no matched record found");
          }
           con.close();
     
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
           
       
   }
   public static void update()
   {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
           Statement st= con.createStatement();
           System.out.println("enter the student number");
           Scanner scan=new Scanner(System.in);
           int a=scan.nextInt();
           String sqlQuery=String.format("update stu_dent  set name='kumar' where no='"+a+"'");
           int UpdateCount=st.executeUpdate(sqlQuery);
           System.out.println("the number of rows update:"+UpdateCount);
           con.close();
       }
      
       catch(Exception e)
       {
           System.out.println(e);
       }
           
       
   }
  
  
   public static void main(String[] args)
   {
       //add();
       //delete();
      
       select();
       update();
   } 
   }


