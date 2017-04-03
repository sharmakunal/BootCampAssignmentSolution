package l1;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			int[] arr=new int[5];
			int i, j, temp, n=5;
			
			System.out.print("Enter array elements");
			
			for(i=0;i<n;i++)
				arr[i]=s.nextInt();
			
			System.out.print("Reverse Array is : ");
			
			
			for(i=0,j=n-1;i<n/2;i++,j--)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
			for(i=0;i<n;i++)
				System.out.print(arr[i]);
			s.close();	

	}

}
