package a2;

import java.util.Scanner;

public class rotateArray {
	
	public static void inputArray(int[] arr)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		sc.close();
	}

	public static void printArray(int[] arr)
	{		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ "  ");
		}
	}
	
	public static int rotate(int[] arr)
	{
		int lo=0, hi=arr.length-1;
		int mid, pos=-1;
		
		while(lo<hi)
		{
			mid=(lo+hi)/2;
			
			if(arr[mid]==1)
			{
				pos=mid;
				break;
			}
			else if(arr[mid+1]== 1)
			{
				pos=mid+1;
				break;
			}
			else if(arr[mid]<arr[lo])
				hi=mid-1;
			else
				lo=mid+1;
		}
		
		return pos;
	}
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		int m;
		
		System.out.print("Enter size of array : ");
		m=s.nextInt();

		int[] arr=new int[m];
			
		System.out.println("Enter array : ");
		inputArray(arr);
		printArray(arr);
			
		System.out.println("\nNumber of rotations is : "+rotate(arr));
		
		s.close();


	}

}
