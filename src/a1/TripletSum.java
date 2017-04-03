package a1;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i, j, k, n, sum, temp, flag=0;

		System.out.print("Enter the size of array : ");
		n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.print("\nEnter array (sorted) : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		System.out.print("\nArray is : ");
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]+ "  ");


		
		System.out.print("\nEnter the sum you want : ");
		sum=s.nextInt();
		
		for(i=0,k=n-1;i<k;i++)
		{
			k=n-1;
			for(j=i+1;j<k;)
			{
				temp=arr[i]+arr[j]+arr[k];
				
				if(temp<sum)
					j++;
				else if(temp> sum)
					k--;
				else if(temp ==sum)
				{
					System.out.print("\nNumbers are : "+ arr[i]+"  "+arr[j]+"  "+arr[k]);
					flag=1;
					break;
				}				
			}

		}
		
		if(flag==0)
			System.out.println("\nNo such numbers exist.");
		s.close();
	}

}
