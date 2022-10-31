package JavaPrograms;
import java.util.Scanner;
public class TwoDArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of Hotels");
		int h=sc.nextInt();
		System.out.println("Enter no of views");
		int v=sc.nextInt();
		int [][] count=new int[h][v];
		for (int i=0;i<h;i++)
		{
			for (int j=0;j<v;j++)
			{
				count[i][j]=sc.nextInt();
			}
		}

	}

}
