package a5;

import java.util.Scanner;


public class isPallindromeLL {
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

	
	public static boolean isPallindrome(Node<Integer> head1, Node<Integer> head2)
	{
		while(head1!=null &&  head2!=null)
		{
			if(head1.data != head2.data)
				return false;
			head1=head1.next;
			head2=head2.next;
		}
		return true;
	}
		
	public static void main(String[] args)
	{
		Node<Integer> head=null, mid=null, head2=null;
		
		head=takeInput(head);
		System.out.print("\nLinked list : ");
		print(head);
		
		System.out.println();
		
		mid=middle(head);
		head2=mid.next;
		mid.next=null;
		System.out.print("\nLinked list 1 : ");
		print(head);
		head2=reverse(head2);
		
		System.out.print("\nLinked list 2 : ");
		print(head2);

		System.out.println("\nThe given linked lists are pallindrome : "+ isPallindrome(head, head2));
	}

}
