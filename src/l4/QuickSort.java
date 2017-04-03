package l4;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int[] arr, int low, int high)
	{
		int x = arr[high];
	    int i = (low - 1);
	    int temp;
	 
	    for (int j = low; j <= high- 1; j++)
	    {
	        if (arr[j] <= x)
	        {
	            i++;
	            temp=arr[i];
	            arr[i]=arr[j];
	            arr[j]=temp;
	        }
	    }
	    temp=arr[i+1];
	    arr[i+1]=arr[high];
	    arr[high]=temp;

	    return (i + 1);
	}
	
	public static void quickSort(int[] arr, int low, int high)
	{
		if(low<high)
		{
			int p=partition(arr, low, high);
			quickSort(arr, low, p-1);
			quickSort(arr, p+1, high);
		}
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+"  ");
	}
	
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		
		int n;
		
		System.out.print("\nEnter the size of array : ");
		n=s.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("\nEnter the array : ");
		
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		printArray(arr);
		
		quickSort(arr, 0,n-1);
		
		System.out.print("\nSorted array : ");
		printArray(arr);
		
		s.close();
	}
}
