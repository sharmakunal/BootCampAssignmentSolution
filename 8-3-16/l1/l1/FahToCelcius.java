package l1;

import java.util.Scanner;

public class FahToCelcius {

	public static void main(String[] args) {
		//		System.out.println(5/9);
		//		
		//		char d = 'a' + 'c';
		//		System.out.println(d);
		//		System.out.println('a' + 'c');

//		float f = 3.4f;
//		
//		boolean b = true;
		Scanner s = new Scanner(System.in);
		int maxValue = s.nextInt();
		int fahrenheit = 0;
		
		while (fahrenheit <= maxValue) {
			int celcius = (int)((5.0/9)* (fahrenheit - 32));
			System.out.println(fahrenheit + "\t" + celcius);
			fahrenheit += 20;
		}
	}

}
