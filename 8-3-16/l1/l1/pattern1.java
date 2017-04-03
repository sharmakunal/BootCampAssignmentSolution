package l1;

import java.util.Scanner;

public class pattern1 {

	public static int factorial(int input) {
		int fact = 1;
		int i = 1;
		while (i <= input) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num rows");
		int n = s.nextInt();
		int value = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}
		s.close();
	}

}
