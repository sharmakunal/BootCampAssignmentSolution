package a1;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=7 ,i, j, pos, temp;
		int[] arr=new int[n];
		
		System.out.println("Enter elements for array1 : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();
		
        for (i = 0; i < arr.length - 1; i++)
        {
            pos = i;
            for (j = i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
     
            temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;            
        }
        
        System.out.println("Sorted array is : ");
		
		for(i=0;i<n;i++)
			System.out.print(arr[i]+ "  	");
		
		s.close();

	}

}
