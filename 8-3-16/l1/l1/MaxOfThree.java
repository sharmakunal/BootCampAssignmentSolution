package l1;

import java.util.Scanner;

public class MaxOfThree {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if (a >= b && a >= c) {
			System.out.println(a);
		} else if (b >= a && b >= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		s.close();
	}

}
