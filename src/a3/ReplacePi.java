package a3;

import java.util.Scanner;

public class ReplacePi {
	
	public static String replacePi(String str)
	{

		if (str.length()==0 || str.length()==1)
			return str;
		else if(str.charAt(0)=='p' && str.charAt(1)=='i')
		{
			char ch;
			String output=new String();
			
			for(int i=2;i<str.length();i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			return "3.14" + output;
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
			return Character.toString(c)+ replacePi(output);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str=s.next();
		
		System.out.print("\nReplaced String is : "+ replacePi(str));
		
		s.close();
	}

}
