package p6;

import java.util.ArrayList;
import java.util.Scanner;



public class CashCrontroller {



   public static ArrayList<Product> displayData()
    {
    Product product=new Product();
    Cashierprovider cashierprovider=new Cashierprovider();
    ArrayList<Product> l=cashierprovider.displayproduct(product);
    for(Product p:l) {
        System.out.println(p.getP_code() +"|"+p.getP_quan()+"|"+p.getP_cateogory()+"|"+p.getP_name()+"|"+p.p_descrip+"|"+p.p_price);
        System.out.println("------------------------------------------------------------------------------------------------------");
    }
    
    return l;
    }
    public static void addData()
    {
    Scanner sc=new Scanner(System.in);
     Product p=new Product();
    System.out.println(" enter product details ");
    System.out.println("code:");p.setP_code(sc.nextInt());
    System.out.println("quantity:");p.setP_quan(sc.nextInt());
    System.out.println("category:");p.setP_cateogory(sc.next());
    System.out.println("name:");p.setP_name(sc.nextInt());
    System.out.println("description(switch/automatic):");p.setP_descrip(sc.nextInt());
    System.out.println("price:");p.setP_price(sc.nextFloat());
     Cashierprovider cashierprovider=new Cashierprovider();
     cashierprovider.addproduct(p);
    }
    
    public static void deleteData1() {
        Scanner sc=new Scanner(System.in);
         Product p=new Product();
         System.out.println("enter the product code:");
         p.setP_code(sc.nextInt());
         Cashierprovider cashierprovider=new Cashierprovider();
         cashierprovider.deproduct(p);
         
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.display the product\n2.add the product\n3.delete the product");
        int c_choice=sc.nextInt();
        ArrayList<Product> ArrayList;
        if(c_choice==1)
            displayData();
        else if(c_choice==2)
            addData();
        else
            deleteData1();



   }



}
