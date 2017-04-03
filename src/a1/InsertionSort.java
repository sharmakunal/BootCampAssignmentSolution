package a1;

import java.util.Scanner;

public class InsertionSort {

	public static void Sort(int[] arr)
	{
		int i,j, key; 
		
		for (i = 1; i < arr.length; i++)
		{
			key=arr[i];
			j=i-1;
			
			while(j>=0 && arr[j]> key)
			{
				arr[j+1] = arr[j];
	            j --;
			}
				
			arr[j+1] = key;
		}
	}
	
	public static void printArray(int[] arr)
	{		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		int n=7 ,i;
		int[] arr=new int[n];
		
		System.out.println("Enter elements for array1 : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		printArray(arr);
        Sort(arr);
        System.out.println();
        printArray(arr);
        s.close();
	}
}
