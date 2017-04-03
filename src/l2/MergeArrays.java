package l2;

import java.util.Scanner;

public class MergeArrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int[] a=new int[10];
		int[] b=new int[10];
		int[] c=new int[20];
		
		int n,m;
		int i, j, k=0;
		
		System.out.println("Enter size of first array : ");
		n=s.nextInt();
		
		System.out.println("Enter array");
		for(i=0;i<n;i++)
			a[i]=s.nextInt();
		
		System.out.println("Enter size of second array : ");
		m=s.nextInt();
		
		System.out.println("Enter array");
		for(i=0;i<m;i++)
			b[i]=s.nextInt();
		
		i=0;
		j=0;
		while(i<n && j<m)
		{
			if(a[i]<=b[j])
			{
				c[k++]=a[i++];
			}
			else
				c[k++]=b[j++];
		}
		
		while(i<n)
			c[k++]=a[i++];

		while(j<m)
			c[k++]=b[j++];
		k--;
		
		for(i=0;i<n+m;i++)
			System.out.print(c[i]+ "  ");

		s.close();
	}

}
