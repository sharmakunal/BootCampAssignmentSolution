package l8;

public class StackUsingArray {

	private int[] data;
	int top;
	
	public StackUsingArray()
	{
		data=new int[10];
		top=-1;
	}
	
	public int size()
	{
		return top+1;
	}
	
	public boolean isEmpty()
	{
		return size()==0;
	}
	
	public void push(int data)
	{
		if(size()==this.data.length)
		{
			System.out.println("Stack full");
			//Exception
		}
		this.data[++top]=data;
	}
	
	public int pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
			//System.out.println("Stack empty");
			//Exception
		}
			
		int temp=this.data[top];
		top--;
		return temp;
	}
}
