package l3;

public class ContainsNo {
	
	public static int containsNo(int[] a, int n)
	{
		if(a.length==0)
			return -1;
		if(a[0]==n)
			return 1;
		
		int smallArray[]=new int[a.length-1];
		for(int i=1;i<a.length;i++)
		{
			smallArray[i-1]=a[i];
		}
		int index=containsNo(smallArray, n);
		
		if(index==-1)
			return -1;
		else
			return ++index;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={2,3,5,6,8,7,9,1,4};
		int n=7;
		
		System.out.println("Array contsians no : "+ containsNo(a, n));

	}

}
