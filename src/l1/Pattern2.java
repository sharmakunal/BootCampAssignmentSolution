package l1;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		System.out.println("Enter value : ");
		
		Scanner s= new Scanner(System.in);
		
		int n=s.nextInt();
		int value=1, j;
		
		
		for(int i=1;i<=n;i++)
		{
			value=i;
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print(value);
				value++;
			}
			for(j=1;j<n;j--)
			{
				value--;
				System.out.print(value);
			}
			
			System.out.println();

		}
		s.close();

	}

}
