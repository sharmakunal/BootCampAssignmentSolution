package a3;

import java.util.Scanner;

public class CheckReverse {
	
	public static boolean isReverse(String str1, String str2)
	{
		if (str1.length()==str2.length() && str1.length()==1)
			return true;

		if (str1.length()!=str2.length())
			return false;
		
		else if(str1.charAt(0)!=str2.charAt(str2.length()-1))
			return false;
		
		char ch;
		String output1=new String();
		
		for(int i=1;i<str1.length();i++)
		{					
			ch= str1.charAt(i);
			output1= output1.concat( Character.toString(ch)  );
		}
		
		String output2=new String();
		
		for(int i=0;i<str2.length()-1;i++)
		{					
			ch= str2.charAt(i);
			output2= output2.concat( Character.toString(ch)  );
		}
		return isReverse(output1, output2);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter 1st string  : ");
		String str1=s.next();

		System.out.print("Enter 2nd string  : ");
		String str2=s.next();

		System.out.print("\nFirst String is reverse of second string : "+ isReverse(str1, str2));
		
		s.close();
	}

}
