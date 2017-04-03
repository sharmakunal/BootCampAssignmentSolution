package a2;

import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		String str;
		int i,j, count=0;
		
		System.out.println("Enter a string : ");
		str=s.next();
		
		System.out.println("String is : "+str);
		
		for(i=0;i<str.length()-1;)
		{
			count=1;
			j=i+1;
			while(str.charAt(i)==str.charAt(j))
			{
				count++;
				j++;
			}
			if(count>=2)
				str=str.substring(0,i+1)+count+str.substring(i+count);
			else
				str=str.substring(0,i+1)+str.substring(i+count);
			i++;
//			System.out.println("new String is : "+str);
		}
		
		System.out.println("String is : "+str);
		
		s.close();
	}

}
