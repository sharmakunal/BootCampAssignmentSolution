package a5;

import java.util.Scanner;

public class ReverseRecursion {
	public static Node<Integer> takeInput(Node<Integer> head)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> tail=null;
		
		System.out.print("\nEnter the data : ");
		int data=s.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newNode=new Node<Integer>(data);
			
			if(head==null)
			{
				head=tail=newNode;
			}
			else
			{
				tail.next=newNode;
				tail=tail.next;
			}
			System.out.print("\nEnter the data : ");
			data=s.nextInt();
		}
		s.close();
		return head;
	}
	
	public static void print(Node<Integer> head)
	{
		while(head!=null)
		{
			System.out.print(head.data+ "->");
			head=head.next;
		}
	}
	

	public static Node<Integer> middle(Node<Integer> head)
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

	public static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> temp;
		if(head==null || head.next==null)
			return head;
		
		temp=reverse(head.next);
		
		head.next.next=head;
		head.next=null;
		
		return temp;
	}

		
	public static void main(String[] args)
	{
		Node<Integer> head=null;
		
		head=takeInput(head);
		System.out.print("\nLinked list : ");
		print(head);
		
		System.out.println();

		head=reverse(head);
		print(head);
	}

}
