package l1;

import java.util.Scanner;

public class Prime2Ton {

	public static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int increment(int i ) {
		return i++;
	}
	
	public static void main(String[] args) {
		
		int kk = 2;
		
		if (kk == 2) {
			int k = 122;
			System.out.println(k);
		}
		
		int k = 10;
		
//		int i1 = 10;
//		i1 = increment(i1++);
//		System.out.println(i1);
//		System.out.println(i1);
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2; i <= n; i++) {
			if (isPrime(i)) {
				System.out.println(i);
			}
		}
		
		s.close();
	}

}
