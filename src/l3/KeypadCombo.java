package l3;

import java.util.Scanner;

public class KeypadCombo {
	
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
	
	public static String[] keypadCombinations(String input)
	{
		if(input.length()==0)
		{
			String[] output=new String[1];
			output[0]="" ;
			return output;
		}
		int k=0;
		String[] smallerOutput=keypadCombinations(input.substring(1));
		
		String[] output=new String[smallerOutput.length * getOptions(input.charAt(0)).length()];
	//	String firstCharOptions = getOptions(input.charAt(0));
		for(int i=0;i<getOptions(input.charAt(0)).length();i++)
		{
			for(int j=0; j<smallerOutput.length;j++)
			{
				
				output[k++]=getOptions(input.charAt(0)).charAt(i) + smallerOutput[j];
			}
		}
		
		k--;
		
		return output;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str;
		System.out.println("Enter the number : ");
		str=s.next();
		
		int size=1;
		for(int i=0; i<str.length();i++)
		{
			size=size* (getOptions(str.charAt(i)).length());
		}
		
		String[] output=new String[size];
		
		output=keypadCombinations(str);

		for(int i=0; i<output.length;i++)
			System.out.println(output[i]);
		
		s.close();
	}

}
