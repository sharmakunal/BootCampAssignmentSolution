package a1;

import java.util.Scanner;

public class Sort0n1 {
	
	public static void sort(int[] arr)
	{
		int i=0, j=arr.length-1, temp;
		
		for( ;i<j; )
		{
			if(arr[i]==0)
				i++;
			if(arr[j]==1)
				j--;
			if(arr[i]==1 && arr[j]==0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				i++;j--;
			}
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
		sort(arr);
		System.out.println();
		printArray(arr);
		s.close();
	}

}
