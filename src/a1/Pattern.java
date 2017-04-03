package a1;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,n,k=0;
		
		//Scanner sc=new Scanner(System.in);
		//n=sc.nextInt();
		
		n=5;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i+1;j++)
				System.out.print(" e ");
			for(j=1;j<=k;j++)
				System.out.print("   ");
			if(i==1)
				for(j=1;j<=n-i;j++)
				{
					k=1;
					System.out.print(" f ");
				}
			else
			{
				for(j=1;j<=n-i+1;j++)
					System.out.print(" g ");	
				k=k+2;
			}			
			System.out.print("\n");
		}
		k=n;
		for(i=1;i<n;i++)
		{
			for(j=1;j<=i+1;j++)
				System.out.print(" h ");
			
			for(j=1;j<=k;j++)
				System.out.print("   ");
			if(i!=n-1)
			{
				for(j=1;j<=i+1;j++)
					System.out.print(" i ");
			}
			else
			{
				for(j=1;j<=i;j++)
					System.out.print(" k ");
			}
			k=k-2;
			System.out.print("\n");
		}
		
	}

}
