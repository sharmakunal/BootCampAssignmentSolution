package l9;

public class QueueUsingLL<T> {
	
	Node<T> head;
	Node<T> tail;
	int count=0;
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else 
			return false;
	}
	
	public void enqueueLL(T data)
	{
		count++;
		Node<T> temp=new Node<T>(data);
		if(size()==1)
		{
			head=tail=temp;
		}
		else
		{
			tail.next=temp;
			tail=temp;
		}
		
	}
	
	public T dequeueLL()
	{
		if(isEmpty())
			return null;
		
		T temp=head.data;
		if(head==tail)
			head=tail=null;
		else
			head=head.next;
		count--;
		
		return temp;
	}
	public int size()
	{
		return count;
	}
}
