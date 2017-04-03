package l2;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int flag=0;
		
		for(int i=0, j=str.length()-1;i<(str.length())/2;i++,j--)
			if(str.charAt(i)!=str.charAt(j))
			{
				flag=1;
				break;
			}
		
		if(flag==1)
			System.out.println("Not pallindrome");
		else
			System.out.println("Pallindrome");

		s.close();
	}

}
