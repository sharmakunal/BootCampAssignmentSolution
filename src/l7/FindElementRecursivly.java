package l7;

import java.util.Scanner;

public class FindElementRecursivly {
	public static Node<Integer> takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter data : ");
		Node<Integer> head=null;
		Node<Integer> tail=null;
		
		int data=s.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null)
			{
				head=newNode;
				tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=newNode;
			}
			
			System.out.print("\nEnter data : ");
			data=s.nextInt();
		}
//		s.close();	
		return head;
	}
	
	public static void print(Node<Integer> head)
	{
		Node<Integer> temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data + "->");
			temp=temp.next;
		}
	}
	
	public static int pos(Node<Integer> head, int ele)
	{
		if(head==null)
			return -1;
		if(head.data==ele)
			return 1;
		
		return 1+ pos(head.next, ele);
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
		
		System.out.print("\nEnter the element you want to find : ");
		int ele=s.nextInt();
		
		System.out.print("\nThe position of the element in the linked list is : "+pos(head,ele));
		s.close();
	}

}
