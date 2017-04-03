package a4;

import java.util.Scanner;

public class StringAnB {
	
	public static boolean checkString(String str, int flag)
	{
		if(str.length()==0)
			return true;
		if(str.charAt(0)=='a' && flag==0)
		{
			flag=1;
			return checkString(str.substring(1), flag);
		}
		else if((flag==1 || flag==2) && str.charAt(0)=='a')
		{
			flag=1;
			return checkString(str.substring(1), flag);
		}
		else if(flag==1 && str.charAt(0)=='b' && str.charAt(1)=='b')
		{
			flag=2;
			return checkString(str.substring(2), flag);
		}
//		else if(str.charAt(0)=='b' && str.charAt(1)!='b')
//		{
//			return false;
//		}

		return false;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter a string : ");
		String str=s.next();
		
		if(checkString(str, 0))
			System.out.println("\nValid String");
		else
			System.out.println("\nInvalid String");
		s.close();
	}

}
