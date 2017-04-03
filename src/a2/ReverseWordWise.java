package a2;

import java.util.Scanner;

public class ReverseWordWise {
	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(str);
//		String arr[]=new String[10];
		String words[]=str.split(" ");
//		String reverse="";
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.print(words[i]+" ");
		}

		s.close();
	}
}
