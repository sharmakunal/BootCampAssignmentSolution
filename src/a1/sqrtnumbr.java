package a1;

import java.util.Scanner;

public class sqrtnumbr {
	
	public static double sqrt(int number) {
		double t;
	 
		double squareRoot = number / 2;
	 
		do {
			t = squareRoot;
			squareRoot = (t + (number / t)) / 2;
		} while ((t - squareRoot) != 0);
	 
		return squareRoot;
	}

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int no=s.nextInt();
		
		System.out.println("Enter the number of precision you want : ");
		int d=s.nextInt();
		
		String st = String.format("%."+d+"f",sqrt(no));
		System.out.println(st);

		s.close();
	}

}
