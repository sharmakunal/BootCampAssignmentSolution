package a2;

import java.util.Scanner;

public class MaxSumPath {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=6,m=7, i,j;
		int sum1=0, sum2=0, res=0, temp=0;
		int[] a1=new int[n];
		int[] a2=new int[m]; 
		
		System.out.println("Enter array");
		for( i=0;i<n;i++)
			a1[i]=s.nextInt();
		
		System.out.println("Enter array");
		for( i=0;i<m;i++)
			a2[i]=s.nextInt();
		
		for( i=0,j=0;  i<n && j<m;)
		{
			
			if(a1[i]>a2[j])
			{
				sum2+=a2[j];
				j++;
			}
			else if (a1[i]<a2[j])
			{
				sum1+=a1[i];
				i++;
			}
			else
			{
				temp = (sum1 >sum2) ? sum1 :sum2;
				res+=temp+a1[i];
				sum1=0;
				sum2=0;
				temp=0;
				i++;
				j++;
			}
					
		}
		
		while(i<n)
		{
			sum1+=a1[i];
			i++;
		}
		
		while(j<m)
		{
			sum2+=a2[j];
			j++;
		}
		
		temp = (sum1 >sum2) ? sum1 :sum2;
		res+=temp;
		
		System.out.println("Maximum sum path is : "+res);
		s.close();
	}

}
