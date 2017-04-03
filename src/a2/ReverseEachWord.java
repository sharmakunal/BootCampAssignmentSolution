package a2;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter string : ");
		String str=s.nextLine();
		
		System.out.print("\nString is : ");
		System.out.println(str);
		
		String words[]=str.split(" ");
		String reverse="";
		
		System.out.print("\nReverse string is : ");
		for(int i=0;i<words.length;i++)
		{
			for(int j=words[i].length()-1;j>=0;j--)
			{
				reverse+=words[i].charAt(j);
			}
			System.out.print(reverse+" ");
			
			
			reverse="";
		}
		s.close();
	}
}
	
