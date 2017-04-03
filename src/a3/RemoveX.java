package a3;

import java.util.Scanner;

public class RemoveX {

	public static String removeX(String str)
	{

		if (str.length()==0)
			return "";
		
		else if(str.charAt(0)=='x')
		{
			char ch;
			String output=new String();
			
			for(int i=1;i<str.length();i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			return removeX(output);
		}
		else
		{
			char c, ch;
			c= str.charAt(0);
			String output=new String();
			
			for(int i=1;i<str.length();i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			return Character.toString(c)+ removeX(output);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str=s.next();
		
		System.out.print("\nReplaced String is : "+ removeX(str));
		
		s.close();
	}
}
