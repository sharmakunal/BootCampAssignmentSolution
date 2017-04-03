package l3;

public class Recurssion {
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		
		return n*fact(n-1);
	}
	
	public static int fib(int n) {
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		return fib(n-1)+fib(n-2);
	}

	public static boolean isSorted(int[] a){
		if(a.length==0 || a.length==1)
			return true;
		if(a[0]>a[1])
			return false;
		
		int smallArray[]=new int[a.length-1];
		
		for(int i=1;i<a.length;i++)
		{
			smallArray[i-1]=a[i];
		}
		
		boolean isSmallerSorted=isSorted(smallArray);
		if(isSmallerSorted)
			return true;
		else 
			return false;
	}
	
	public static void main(String[] args) {
		fib(5);
		fact(5);

	}

}
