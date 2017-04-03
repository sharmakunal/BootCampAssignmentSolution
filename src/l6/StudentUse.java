package l6;

public class StudentUse {

	public static <T extends StudentCompare<T>> void sort(T[] input)
	{
		T temp;
		
		for(int i=0; i<input.length-1;i++)
		{
			for(int j=0;j<input.length-i-1;j++)
			{
				if(input[j].compareTo(input[j+1])==-1)
				{
					temp=input[j];
					input[j]=input[j+1];
					input[j+1]=temp;
				}
			}
		}
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		
		Student[] s=new Student[10];
		
		for(int i=0;i<s.length;i++)
			s[i]=new Student();
		
		for(int i=0;i<s.length;i++)
			s[i].setMarks(100-i);
		
		for(int i=0;i<s.length;i++)
			s[i].setName("a");
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i].marks+ " ");
		
		System.out.println();
		sort(s);
		
		for(int i=0;i<s.length;i++)
			System.out.print(s[i].marks+ " ");
		
	}
}
