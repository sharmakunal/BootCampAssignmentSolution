package a2;

import java.util.Scanner;

public class MinLengthWord {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		System.out.println(str);
//		String arr[]=new String[10];
		String words[]=str.split(" ");
//		String reverse="";
		String str2="";
		int length=words[0].length();
		str2=words[0];
		for(int i=1;i<words.length;i++)
		{
			if(length>words[i].length())
			{
				length=words[i].length();
				System.out.println(length);
				str2=words[i];
			}
		}
		System.out.println("minimum length word is: "+str2);
		
		s.close();
	}	
}
