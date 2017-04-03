package l8;

public class QueueUsingLL {
	
	Node<Integer> head;
	Node<Integer> tail;
	int count=0;
	
	public boolean isEmpty()
	{
		if(head==null)
			return true;
		else 
			return false;
	}
	
	public void pushLL(int data)
	{
		count++;
		Node<Integer> temp=new Node<Integer>(data);
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
	
	public int popLL()
	{
		if(isEmpty())
			return -1;
		
		int temp=head.data;
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
