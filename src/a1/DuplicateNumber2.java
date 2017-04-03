package a1;

import java.util.Scanner;

public class DuplicateNumber2 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=7 ,i, sum1=0, sum2=0; 
		int[] arr=new int[n];
		
		System.out.println("Enter elements for array1 : ");
		
		for(i=0;i<n;i++)
			arr[i]=s.nextInt();

		for(i=0;i<n;i++)
		{	
			sum1+=arr[i];
			sum2+=arr[i];
			
			if(i==n-1)
				sum2-=arr[i];
		}
		int res=sum1-sum2;
		System.out.println("Duplicate Number is : "+ res);
		
		s.close();
	}

}
