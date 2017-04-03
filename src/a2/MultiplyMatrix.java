package a2;

import java.util.Scanner;

public class MultiplyMatrix {
	
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
				System.out.print(arr[i][j]+ "  ");
			System.out.println();
		}
	}
	
	public static void multiplyArray(int[][] arr1, int[][] arr2, int m, int n, int p)
	{		
		int[][] arr3=new int[m][p];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<p;j++)
			{
				for(int k=0;k<n;k++)
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
			}
		}
		
		printArray(arr3);
	}


	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n, o, p;
		
		System.out.print("Enter row size of 1st matrix : ");
		m=s.nextInt();
		
		System.out.print("Enter column size of 1st matrix : ");
		n=s.nextInt();
		
		System.out.print("Enter row size of 2nd matrix : ");
		o=s.nextInt();
		
		System.out.print("Enter column size of 2nd matrix : ");
		p=s.nextInt();

		if(n==o)
		{
			int[][] arr1=new int[m][n];
			
			System.out.println("Enter array : ");
			inputArray(arr1);
			printArray(arr1);
			
			int[][] arr2=new int[o][p];
			
			System.out.println("Enter array : ");
			inputArray(arr2);
			printArray(arr2);
			
			System.out.println("Resultant matrix is : ");
			multiplyArray(arr1,arr2,m,n,p);
		}
		else
			System.out.println("Wrong size of arrays were given");
	
		
		s.close();
	}
}
