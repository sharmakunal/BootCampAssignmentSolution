package a4;

import java.util.Scanner;

public class PrintPermutations {
	
//	public static int fact(int num)
//	{
//		int f=1;
//		while(num>0)
//		{
//			f=f*num;
//			num--;
//		}
//		return f;
//	}
//	
	public static void printPermu(String str, String ansSoFar)
	{
		if(str.length()==0)
			System.out.print(ansSoFar+"  ");
		else
		{
			for(int i=0;i<str.length();i++)
			{
				printPermu(str.substring(0,i)+str.substring(i+1), ansSoFar+str.charAt(i));
			}	
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str=s.next();
	
		System.out.print("\nPermutations are : ");
		
		printPermu(str,"");
		s.close();
	}

}
