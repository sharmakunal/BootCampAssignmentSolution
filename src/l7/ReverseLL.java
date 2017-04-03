package l7;

import java.util.Scanner;

public class ReverseLL {
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
	
	
	public static Node<Integer> ReverseRecurssive(Node<Integer> head)
	{
		if(head==null || head.next==null)
			return head;
			
		Node<Integer> temp=ReverseRecurssive(head.next);
		head.next.next=head;

		head.next=null;
		
		return temp;
		
	}
	
	public static Node<Integer> reverse(Node<Integer> head)
	{
		Node<Integer> temp=head, temp1=null;
		
		if(head!=null)
		{
			temp=head.next;
			head.next=null;
		}
		
		while(temp!=null)
		{
			temp1=temp;
			temp=temp.next;
			temp1.next=head;
			head=temp1;
		}
		
		return head;
	}
		
	public static void main(String[] args)
	{
		Node<Integer> head=null;
		
		head=takeInput(head);
		print(head);
		
		System.out.println();
		head=reverse(head);
		print(head);
		
		head=ReverseRecurssive(head);
		print(head);
	
	}

}
