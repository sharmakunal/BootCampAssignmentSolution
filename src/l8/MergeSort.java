package l8;

import java.util.Scanner;

public class MergeSort {
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

	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2)
	{
		if(head1==null)
			return head2;
		if(head2==null)
			return head1;
		
		Node<Integer> head=null, tail=null;
		
		if(head1.data<head2.data)
		{
			head=head1;
			tail=head1;
			head1=head1.next;
		}
		else
		{
			head=head2;
			tail=head2;
			head2=head2.next;
		}
		
		while(head1!=null && head2!=null)
		{
			if(head1.data<head2.data)
			{
				tail.next=head1;
				tail=head1;
				head1=head1.next;
			}
			else
			{
				tail.next=head2;
				tail=head2;
				head2=head2.next;
			}
		}
		if(head1!=null)
			tail.next=head1;

		if(head2!=null)
			tail.next=head2;

		return head;
	}

	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		Node<Integer> slow=head;
		Node<Integer> fast=head;
		
		if(head==null || head.next==null )
			return head;
		
		while(fast.next!=null && fast.next.next!=null)		// finding middle of list
		{
			slow=slow.next;
			fast=fast.next.next;
		}

		Node<Integer> temp1=head;
		Node<Integer> temp2=slow.next;
		slow.next=null;
		
		temp1=mergeSort(temp1);
		temp2=mergeSort(temp2);
		
		head=merge(temp1, temp2);
		
		return head;
	}
	
	public static void main(String[] args)
	{
		Node<Integer> head =takeInput();
		print(head);
		
		System.out.print("\nSorted list is : ");
		head=mergeSort(head);
		print(head);
		
	}
}
