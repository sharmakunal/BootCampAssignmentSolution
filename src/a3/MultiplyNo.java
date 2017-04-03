package a3;

import java.util.Scanner;

public class MultiplyNo {

	public static int multiplyNo(int m, int n)
	{
		if(n==0)
			return 0;
		return m+ multiplyNo(m, n-1);
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter 1st no  : ");
		int m=s.nextInt();

		System.out.print("\nEnter 2nd no  : ");
		int n=s.nextInt();
		
		System.out.print("\nMultiplication is  : "+ multiplyNo(m, n));
		
		s.close();
	}

}
