package a1;

import java.util.Scanner;

public class Sort0n1n2 {
	
	public static void sort(int[] a)
	{
		int lo = 0;
        int hi = a.length-1;
        int mid = 0,temp=0;
        
        while (mid <= hi)
        {
            switch (a[mid])
            {
	            case 0:
			            {
			                temp   =  a[lo];
			                a[lo]  = a[mid];
			                a[mid] = temp;
			                lo++;
			                mid++;
			                break;
			            }
	            case 1:
		                mid++;
		                break;
	            case 2:
			            {
			                temp = a[mid];
			                a[mid] = a[hi];
			                a[hi] = temp;
			                hi--;
			                break;
			            }
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
