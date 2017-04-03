package l8;

import java.util.Scanner;

public class midOfLinkedList {
	
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
		s.close();
		return head;
	}
	
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data + "->");
			head=head.next;
		}
	}


	public static Node<Integer> printMiddle(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		if(head==null || head.next==null)
			return head;
		
		while(fast.next!=null && fast.next.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args)
	{
		Node<Integer> head =takeInput();
		print(head);
		
		Node<Integer> mid=printMiddle(head);
		
		System.out.println("Middle element is : "+ mid.data);
		
	}

}
