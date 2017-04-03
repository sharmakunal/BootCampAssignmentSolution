package l1;

import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int[] arr=new int[10];
		int item, i;
		
		System.out.print("Enter array elements");
		
		for(i=0;i<10;i++)
			arr[i]=s.nextInt();
		
		System.out.print("Enter item to be searched  : ");
		item=s.nextInt();
		
		s.close();
		
		for(i=0;i<10;i++)
		{
			if(arr[i]==item)
			{
				System.out.print("Positiion is : "+(i+1));
				return;
			}
		}
		System.out.print("Positiion is : -1");	
	}

}
