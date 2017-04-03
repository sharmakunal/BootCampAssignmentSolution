package l2;

import java.util.Scanner;

public class SpiralArray {
	
	public static void inputArray(int[][] arr)
	{
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
	}

	public static void printArray(int[][] arr)
	{		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+"  ");
			System.out.println();
		}
	}

	public static void printSpiral(int[][] arr, int m, int n)
	{		
		// m : rows
		//n : cols
		for(int j=0;j<n;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<m;i++)
					System.out.print(arr[i][j]);	
			}
			else
				for(int i=m-1;i>=0;i--)
					System.out.print(arr[i][j]);
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n;
		
		
		System.out.println("Enter row size : ");
		m=s.nextInt();
		
		System.out.println("Enter column size : ");
		n=s.nextInt();

		int[][] arr=new int[m][n];
		System.out.println("Enter array : ");
		inputArray(arr);
		
		printArray(arr);
		
		printSpiral(arr,m, n);
		
		s.close();
	}

}
