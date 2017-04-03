package a3;

import java.util.Scanner;

public class NoOfZeros {
	
	public static int countZeros(int n)
	{
		if (n==0)
			return 0;
		if(n% 10==0)
			return 1 + countZeros(n/10);
		else 
			return 0 + countZeros(n/10);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter no  : ");
		int n=s.nextInt();
		
		System.out.print("\nNumber of Zeros are  : "+ countZeros(n));
		
		s.close();

	}

}
