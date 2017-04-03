package a3;

import java.util.Scanner;

public class Pallindrome {
	public static boolean isPallindrome(String str)
	{

		if (str.length()==0 || str.length()==1)
			return true;
		else if(str.charAt(0)==str.charAt(str.length()-1))
		{
			String output=new String();
			
			char ch;
			for(int i=1;i<str.length()-1;i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			return isPallindrome(output);
		}
		else
			return false;
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str=s.next();
		
		System.out.print("\nNumber of Zeros are  : "+ isPallindrome(str) );
		
		s.close();

}
}