package l4;

import java.util.Scanner;

public class PrintKeypad {
	
	public static String getOptions(char c)
	{
		if(c=='2')
			return "abc";
		if(c=='3')
			return "def";
		if(c=='4')
			return "ghi";
		if(c=='7')
			return "pqrs";
		return " ";
	}
	
	public static void printKeypad(String num, String ansSoFar)
	{
		if(num.length()==0)
		{
			System.out.println(ansSoFar);
			return;
		}
		
		String options=getOptions(num.charAt(0));
		
		for(int i=0;i<options.length();i++){
			printKeypad(num.substring(1), ansSoFar+ options.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str;
		System.out.println("Enter the number : ");
		str=s.next();
	
		printKeypad(str,"");
		
		s.close();
	}

}
