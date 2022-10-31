package JavaPrograms;
import java.util.Scanner;
public class Primemn {



	   public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        int num1,num2,flag,count=0;
	        System.out.println("enter  the two numbers:");
	        num1=sc.nextInt();
	        num2=sc.nextInt();
//	        int i=num1;
	        int j;
	        while(num2>num1)
	        {
	            flag=0;
	            for( j=2;j<=num1;j++)
	            {
	                if(num1%j==0)
	                {
	                    break;
	                }
	            }
	            if((num1==j))
	            {
	            count++;
	            System.out.println(num1);
	            }
	            num1++;
	        }
	        System.out.println("total number of prime number are "+count);
	    
	    }



	}


