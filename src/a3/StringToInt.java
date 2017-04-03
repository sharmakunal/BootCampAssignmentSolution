package a3;

import java.util.Scanner;

public class StringToInt {

	public static int convertString(String str)
	{

		if (str.length()==0)
			return 0;
		
		else
		{
			int c= Integer.parseInt( Character.toString(str.charAt(str.length()-1)));
			
			char ch;
			String output=new String();
			
			for(int i=0;i<str.length()-1;i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			
			return c+10*convertString(output);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str=s.next();
		
		System.out.print("\nReplaced String is : "+ convertString(str));
		
		s.close();
	}
}
