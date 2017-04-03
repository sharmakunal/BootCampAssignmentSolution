package l8;

public class StackUsingLinkedList {
	
	Node<Integer> head;
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
		temp.next=head;
		head=temp;
	}
	
	public int popLL()
	{
		if(isEmpty())
			return -1;
		
		int temp=head.data;
		head=head.next;
		count--;
		
		return temp;
	}
	public int size()
	{
		return count;
	}
}
