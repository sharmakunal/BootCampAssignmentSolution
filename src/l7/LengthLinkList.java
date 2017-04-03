package l7;

import java.util.Scanner;

public class LengthLinkList {
	
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
	
	public static int len(Node<Integer> head)
	{
		if(head==null)
			return 0;
		if(head.next==null)
			return 1;
		head=head.next;
		int length=len(head);
		
		return length+1;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
	
		System.out.println("\nLength of Linked list is : " +len(head));
	
		s.close();
	}

}
