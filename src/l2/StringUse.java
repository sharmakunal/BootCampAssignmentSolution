package l2;

import java.util.Scanner;

public class StringUse {

	public static void main(String[] args) {
		String str="abcd";
		str.charAt(2);	//gives c
		str.substring(2);	//cd
		str.substring(1, 3);	//bc (goes to endindex-1)
		
		System.out.println(str);
		
		for(int i=0;i<str.length();i++)
			System.out.println(str.charAt(i));
		
		
		Scanner s=new Scanner(System.in);
		
//		String str1=s.nextLine();
//		System.out.println(str1);
//		
//		String str2=s.next();
//		System.out.println(str2);
//		
//		s.useDelimiter(",");		// replacing white space with delimeter (used with only next note nextLine)
//		String str3=s.next();
//		System.out.println(str3);
		
		
		int numLine=0;
		int numWord=0;
		int numChar=0;
		
		boolean done=false;
		while(!done)
		{
			String line=s.nextLine();
			numLine++;
			numWord++;
			for(int i=0;i<=line.length();i++)
			{
				if(line.charAt(i)=='$'){
					done=true;
					break;
				}
				numChar++;
				if(line.charAt(i)==' ')
				{
					numWord++;
				}
			}
			if(!done)
				numWord++;
		}
		
		System.out.println("Char count : "+numChar);
		System.out.println("Word count : "+numWord);
		System.out.println("Line count : "+numLine);
		
		s.close();
	}

}
