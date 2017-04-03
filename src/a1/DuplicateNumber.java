package a1;

import java.util.Scanner;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=7 ,i, j,key; 
		int[] arr=new int[n];
		
		System.out.println("Enter elements for array1 : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();

		for(i=0;i<n;i++)
		{	
			key=arr[i];
			for(j=0;j<n;j++)
			{
				if(j==i)
					continue;
				else
				{
					if(arr[j]==key && i>=j)
						System.out.println("Repeated number is : "+key);
				}
				
			}
		}
		
		s.close();
	}

}
