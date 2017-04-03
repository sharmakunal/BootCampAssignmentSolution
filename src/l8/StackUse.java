package l8;

public class StackUse {
	public static void main(String[] args) throws StackEmptyException
	{
		StackUsingArray stack=new StackUsingArray();
		
		for(int i=0;i<5;i++)
		{
			stack.push(i);
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.println(stack.pop());
		}
	}

}
