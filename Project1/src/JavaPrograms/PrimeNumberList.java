package JavaPrograms;

import java.util.Scanner;
 
public class PrimeNumberList {
 
    private static Scanner scanner = new Scanner( System.in );
 
    public static void main(String[] args) {
 
        System.out.println("Enter number: ");
 
        String input = scanner.nextLine();
        int maxNumber = Integer.parseInt( input );
 
        for (int num = 20; num <= maxNumber; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
    }
}
