package l1;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter values : ");
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if(a>=b && a>=c)
			System.out.print(a);
		else if(b>=a && b>=c)
			System.out.print(b);
		else
			System.out.print(c);
		
		s.close();
	}

}
