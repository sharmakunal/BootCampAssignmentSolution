package a5;

import java.util.Scanner;

public class InsertDeleteRecursv {
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
	
	public static Node<Integer> insert(Node<Integer> head, Node<Integer> newNode, int pos)
	{
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		else
			head.next=insert(head.next, newNode, pos-1);
		
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer>head, int pos)
	{
		if(pos==1)
		{
			head=head.next;
		}
		else
			head.next=delete(head.next, pos-1);
		
		return head;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
		
		System.out.print("\nEnter the position you want to enter the data : ");
		int pos=s.nextInt();
		
		System.out.print("\nEnter the data of new node : ");
		int data=s.nextInt();
	
		Node<Integer> newNode=new Node<Integer>(data);
		
		head=insert(head,newNode,pos);
		print(head);
		
		System.out.print("\nEnter the position you want to delete : ");
		pos=s.nextInt();
		
		delete(head, pos);
		print(head);
		
		s.close();
	}

}
