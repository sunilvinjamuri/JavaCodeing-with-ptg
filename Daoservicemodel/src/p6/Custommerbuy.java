package p6;

import java.util.ArrayList;
import java.util.Scanner;



public class Custommerbuy {
    static  float c_bill;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("available products:");
        CashCrontroller cashCrontroller=new  CashCrontroller();
         ArrayList<Product> p=CashCrontroller.displayData();
        while(true)
        {
            
            String pname;
            System.out.println("choose the product code");
            int pcode=sc.nextInt();
            Product p1=new Product();
            System.out.println("you have selected ");
            for(Product pm:p) {
                if(pcode==pm.getP_code()) {
                    System.out.println("code:"+pm.getP_code() +"\n\n"+"quantity:"+pm.getP_quan()+"\n\n"+"category:"+pm.getP_cateogory()+"\n\n"+"productname:"+pm.getP_name()+"\n\n"+"description:"+pm.getP_descrip()+"\n\n"+"price:"+pm.getP_price());
                    System.out.println("enter the quantity:");
                    int quantity=sc.nextInt();
                    if(quantity<=pm.getP_quan())
                    {
                       c_bill+=pm.getP_price()*quantity;
                        System.out.println("your bill-->" +c_bill);
                    }else {
                        System.out.println("net quantity only"+pm.getP_quan());
                    }
                }
                
            }
            System.out.println("enter 1 to continue or 0 to exit");
            int choice=sc.nextInt();
            if(choice==0)
                break;
        }
            



   }

}
