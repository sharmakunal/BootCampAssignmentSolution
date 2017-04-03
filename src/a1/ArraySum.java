package a1;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=3,i, carry=0, no; 
		
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		int[] result=new int[n];
		
		System.out.println("Enter elements for array1 : ");
		
		for(i=0;i<n;i++)
			arr1[i]=s.nextInt();
		
		System.out.println("Enter elements for array2 : ");
		
		for(i=0;i<n;i++)
			arr2[i]=s.nextInt();
		
		for(i=n-1;i>=0;i--)
		{
			no=arr1[i]+arr2[i]+carry;
			result[i]=no%10;
			carry=no/10;
		}
		
		System.out.println("Result is : ");
		
		for(i=0;i<n;i++)
			System.out.print(result[i]+ "  ");
			
		s.close();

	}

}
