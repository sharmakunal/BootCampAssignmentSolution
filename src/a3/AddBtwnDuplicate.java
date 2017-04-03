package a3;

import java.util.Scanner;

public class AddBtwnDuplicate {
	
	public static String addStar(String str)
	{

		if (str.length()==0)
			return "";
		
		else if(str.length()==1)
			return str;
		
		else if(str.charAt(0)==str.charAt(1))
		{
			char ch;
			String output=new String();
			
			for(int i=1;i<str.length();i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			
			String temp= Character.toString(str.charAt(0))+ "*";
			return temp + addStar(output);
		}
		else
		{
			char ch;
			String output=new String();
			
			for(int i=1;i<str.length();i++)
			{					
				ch= str.charAt(i);
				output= output.concat( Character.toString(ch)  );
			}
			
			String temp= Character.toString(str.charAt(0));
			return temp + addStar(output);

		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the string  : ");
		String str=s.next();
		
		System.out.print("\nReplaced String is : "+ addStar(str));
		
		s.close();
	}

}
