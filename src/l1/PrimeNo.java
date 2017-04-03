package l1;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N :");
		int n=s.nextInt();
		int i,j;
		int flag=0;
		
		for(i=2;i<=n;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.print(i+ "");
		}
		s.close();
	}

}
