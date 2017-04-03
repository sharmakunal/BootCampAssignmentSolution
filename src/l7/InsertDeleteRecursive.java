package l7;

import java.util.Scanner;

public class InsertDeleteRecursive {
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
	
	public static Node<Integer> insert(Node<Integer> head, int pos, Node<Integer> newNode)
	{
		if(pos==1)
		{
			newNode.next=head;
			return newNode;
		}
		
		head.next=insert(head.next, pos-1, newNode);
		
		return head;
	}
	
	public static Node<Integer> delete(Node<Integer> head, int pos)
	{
		if(pos==1)
		{
			head=head.next;
			return head;
		}
		
		head.next=delete(head.next, pos-1);
		
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
		
		head=insert(head,pos,newNode);
		print(head);
		
		System.out.print("\nEnter the position you want to delete the data : ");
		pos=s.nextInt();
		
		head=delete(head,pos);
		print(head);
	
		s.close();
	}

}
