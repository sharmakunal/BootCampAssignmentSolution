package l8;

public class CharStack {

	private char[] data;
	int top;
	
	public CharStack()
	{
		data=new char[20];
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
	
	public void push(char data)
	{
		if(size()==this.data.length)
		{
			System.out.println("Stack full");
			//Exception
		}
		this.data[++top]=data;
	}
	
	public char pop() throws StackEmptyException
	{
		if(isEmpty())
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
			//System.out.println("Stack empty");
			//Exception
		}
			
		char temp=this.data[top];
		top--;
		return temp;
	}
}
