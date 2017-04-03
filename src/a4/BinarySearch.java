package a4;

import java.util.Scanner;

public class BinarySearch {

	public static int binarySearch(int[] arr, int item, int lo, int hi)
	{		
		if(lo<=hi)
		{
			int mid=(lo+hi)/2;
			
			if(arr[mid]==item)
				return mid;
			else if(arr[mid]>item)
				hi=mid-1;
			else 
				lo=mid+1;

			return binarySearch(arr, item, lo, hi);
		}		
		else
			return -1;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int n=7, item;
		int[] arr=new int[n];
		
		System.out.println("Enter elements for array : ");
		
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		System.out.print("\nArray is : ");
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+ "  ");
		
		System.out.print("\nEnter item to be searched : ");
		item=s.nextInt();

		System.out.println("Position is : " +(binarySearch(arr, item, 0, n-1)+1));

		s.close();
	}

}
