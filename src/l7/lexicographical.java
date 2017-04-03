package l7;

public class lexicographical {
	
	public static void print_lexicographical(int n)
	{
		for(int i=1;i<=9;i++)
		{
			print_lexicographical(n,i);
		}
	}
	
	public static void print_lexicographical(int n, int numSoFar)
	{
		if(numSoFar>n)
		{
			return;
		}
		
		System.out.println(numSoFar);
		for(int i=0;i<10;i++)
		{
			print_lexicographical(n,numSoFar*10 +i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		print_lexicographical(1000);

	}

}
