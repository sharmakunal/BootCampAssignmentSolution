package l1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		for (int d = 2; d < n; d++) {
			if (n % d == 0) {
				System.out.println(" not prime");
				return;
			}
		}
		System.out.println("prime");
	}

}
