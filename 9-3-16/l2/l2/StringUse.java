package l2;

import java.util.Scanner;

public class StringUse {

	public static void main(String[] args) {
		int [] a = new int[10];
		System.out.println(a);
		
		String s = "abdc";
		System.out.println(s);
		
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		
		Scanner scanner = new Scanner(System.in);
		int numLine = 0;
		int numWord = 0;
		int numChar = 0;
		
		boolean done = false;
		while (!done) {
			String line = scanner.nextLine();
			numLine++;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == '$') {
					done = true;
					break;
				}
				numChar++;
				if (line.charAt(i) == ' ') {
					numWord++;
				}
			}
			if (!done) {
				numWord++;
			}
		}
		
		
		
		
		// deleimiter
		scanner.useDelimiter("");
		String str2 = scanner.next();
		System.out.println(str2);
	}

}
