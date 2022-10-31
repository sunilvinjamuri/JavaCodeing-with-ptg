package veg_dtls;
import java.util.Scanner;
class Brinjal
{
    static float qty=100,price=40,cbk;
}
class Tomatos
{
    static float qty=100,price=30,ctk;
}
class Potato
{
    static float qty=100,price=20,cpk;
}
public class Bill_dtls
{
	
public class Vegtables_dtls {



   @SuppressWarnings("static-access")
    public static void vegInfo()
    {
    Brinjal b=new Brinjal();
    Tomatos t=new Tomatos();
    Potato p=new Potato();
    Scanner s=new Scanner(System.in);
    System.out.println("\n\tWELCOME TO VEGTABLES STORE\n");
    System.out.println("Available items are:\n\n P.CODE\t\t\t Price --\t \t\tQuantity\n");
    System.out.println(" 101--  Brinjal price : ₹"+b.price+".rs/Kg  QTY (kgs) : "+b.qty+"KG");
    System.out.println(" 102--  Tomatos price : ₹"+t.price+".rs/Kg  QTY (kgs) : "+t.qty+"KG");
    System.out.println(" 103--  Potatos price : ₹"+p.price+".rs/Kg  QTY (kgs) : "+p.qty+"KG");



   int citm,wn;
    System.out.println("\nEnter the item P.Code which you want : ");citm=s.nextInt();
    switch(citm)
    {
    case 101 :  {
        System.out.println(" Binjal is good choice !..\n\nEnter How many Kgs you want : ");b.cbk=s.nextFloat();
        b.qty-=b.cbk;
        System.out.println("you want to continue shopping Press '1' \n else Press '2'");wn=s.nextInt();
        if(wn==1) vegInfo();
        else  Bill_dtls.calcBill();
        break;
    }
    case 102 :{
        System.out.println(" Tomato is good choice !..\n\nEnter How many Kgs you want : ");t.ctk=s.nextFloat();
        t.qty-=t.ctk;
        System.out.println("you want to continue shopping Press '1' \n else Press '2'");wn=s.nextInt();
        if(wn==1) vegInfo();
        else  
        	Bill_dtls.calcBill();break;
    }
    case 103 :{
        System.out.println(" Potato is good choice !..\n\nEnter How many Kgs you want : ");t.ctk=s.nextFloat();
        p.qty-=p.cpk;
        System.out.println("you want to continue shopping Press '1' \n else Press '2'");wn=s.nextInt();
        if(wn==1) vegInfo();
        else  
        	Bill_dtls.calcBill();break;
    }
    default : System.out.println("Invalid INPUT..!");
    }
    s.close();
    }
    public static void main(String[] args)
    {
        vegInfo();
    }
}
public static void calcBill() {
	// TODO Auto-generated method stub
	
}
}