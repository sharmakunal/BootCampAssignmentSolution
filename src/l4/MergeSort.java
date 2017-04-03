package l4;

import java.util.Scanner;

public class MergeSort {

	public static void merge(int[] arr1, int[] arr2, int[] c)
	{
		int i=0;
		int j=0;
		int k=0;
		int n=arr1.length;
		int m=arr2.length;
	
		
		while(i<n && j<m)
		{
			if(arr1[i]<=arr2[j])
			{
				c[k++]=arr1[i++];
			}
			else
				c[k++]=arr2[j++];
		}
		
		while(i<n)
			c[k++]=arr1[i++];

		while(j<m)
			c[k++]=arr2[j++];
		k--;
	}
	
	public static void mergeSort(int[] input)
	{
		if(input.length==1 || input.length==0)
			return ;
				
		int first=0;
		int last=input.length;
		int mid=(first+last)/2;
		
		int[] p1=new int[mid];
		int[] p2=new int[last-mid];
		
		for(int i=0;i<mid;i++)
			p1[i]=input[i];

		for(int i=mid, k=0;i<input.length;i++,k++)
			p2[k]=input[i];

		
		mergeSort(p1);
		mergeSort(p2);
		
		merge(p1,p2, input);
	}
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=5;
		int[] arr=new int[n];
		
		System.out.print("Enter array");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		mergeSort(arr);
		
		System.out.println("\nSorted array is : ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+ "  ");
		s.close();
	}

}
