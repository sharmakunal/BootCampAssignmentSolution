package l2;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		
		int first=0;
		int last=a.length-1;
		int mid;
		
		System.out.println("Enter array");
		for(int i=0;i<10;i++)
			a[i]=s.nextInt();
		
		
		System.out.println("Enter item to be serached : ");
		int item=s.nextInt();

		s.close();
		
		while(first<=last)
		{
			mid=(first+last)/2;
			
			if(item==a[mid])
			{
				System.out.println("Element found at : "+ (mid+1));
				return;
			}
			else if(item>a[mid])
				first=mid+1;
			else 
				last=mid-1;
			
		}
		
		System.out.println("Element not found");
		

	}

}
