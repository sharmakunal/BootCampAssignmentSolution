package a3;

import java.util.Scanner;

public class Series {

	public static double series(double n)
	{

		if (n==0)
			return 0;
		if (n==1)
			return 1;
		double x= Math.pow(2, n-1);
		return  (1.0/x) + series(n-1);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the count till you want the sum  : ");
		double n=s.nextDouble();
		
		System.out.print("\nNumber of Zeros are  : "+ series(n));
		
		s.close();
	}

}
