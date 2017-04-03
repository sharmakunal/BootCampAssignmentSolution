package l4;

import java.util.Scanner;

public class PairSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i, j, n, sum, temp, flag=0;

		System.out.print("Enter the size of array : ");
		n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("\nEnter array (sorted) : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		System.out.print("\nEnter the sum you want : ");
		sum=s.nextInt();
		
		for(i=0,j=n-1;i<j;)
		{
			temp=arr[i]+arr[j];
			
			if(temp<sum)
				i++;
			else if(temp> sum)
				j--;
			else if(temp ==sum)
			{
				System.out.print("\nNumbers are : "+ arr[i]+"  "+arr[j]);
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			System.out.println("\nNo such numbers exist.");
		s.close();
	}

}
