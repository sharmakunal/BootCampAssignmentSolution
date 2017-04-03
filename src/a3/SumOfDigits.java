package a3;

import java.util.Scanner;

public class SumOfDigits {

	public static int digitsSum(int n)
	{

		if (n==0)
			return 0;
		int rem=n%10;
		return rem+digitsSum(n/10);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number  : ");
		int n=s.nextInt();
		
		System.out.print("\nSum of digits are : "+ digitsSum(n));
		
		s.close();
	}
}
