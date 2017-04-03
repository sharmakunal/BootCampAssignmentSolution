package l2;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String str=s.next();
		
		for(int i=0;i<str.length();i++)
			for(int j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1));
			}
		s.close();
	}

}
