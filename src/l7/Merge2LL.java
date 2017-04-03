package l7;

import java.util.Scanner;

public class Merge2LL {
	
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
	
	public static Node<Integer> merge(Node<Integer>head1, Node<Integer>head2)
	{
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
	
	public static void main(String[] args)
	{
		Node<Integer> head1=null, head2=null, head3=null;
		
		head1=takeInput(head1);
		print(head1);
		
		System.out.println();
		head2=takeInput(head2);
		print(head2);
		
		System.out.println();
		head3=merge(head1,head2);
		print(head3);
	}

}
