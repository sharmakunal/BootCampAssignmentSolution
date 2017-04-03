package a2;

import java.util.Scanner;

public class RotateMatrix {
	
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
	
	public static void rotateMatrix(int[][] arr)
	{
		int i, j, n =arr.length, m=arr[0].length;
		
		int[][] matrix=new int[n][m];
		
		for (i = 0; i < n; ++i) 
		{
	        for (j = 0; j < m; ++j)
	        {
	        	matrix[i][j] = arr[n - j - 1][i];
	        }
		}
		printArray(matrix);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m;
		
		System.out.print("Enter size of matrix : ");
		m=s.nextInt();

		int[][] arr=new int[m][m];
			
		System.out.println("Enter array : ");
		inputArray(arr);
		printArray(arr);
			
		System.out.println("Resultant matrix is : ");
		rotateMatrix(arr);
		
		s.close();


	}

}
