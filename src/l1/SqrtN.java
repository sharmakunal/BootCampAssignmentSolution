package l1;

import java.util.Scanner;

public class SqrtN {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=s.nextInt();
		
//		System.out.println("Enter number of decimal places :");
//		int d=s.nextInt();
		
		int flag=0;
		float i;
		
		for(i=1;i<=n/2;i+=0.1)
		{
			if(i*i==n)
			{
				flag=1;
				break;
			}
			else if(i*i<n)
				continue;
			else if(i*i>n)
				break;
		}
		if(flag==1)
			System.out.print(i);
		else
			System.out.print(i - 1);
		s.close();
	}
}
