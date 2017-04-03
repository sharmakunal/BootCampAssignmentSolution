package l2;

public class CircularJail {

	public static void main(String[] args) {
		int[] arr=new int[101];
		int i,j, count=0;

		for(i=1;i<100;i++)			//number of  times the jailor take rounds (i+1)
		{
			for(j=1;j<100;j=j+i)		// to update the array
			{
				if(arr[j]==0)
					arr[j]=1;
				else
					arr[j]=0;
			}
		}
		
		for(i=0;i<101;i++)
		{
			if(arr[i]==1)
				count++;
		}
		
		System.out.println("Number of open doors : "+count);

	}

}
