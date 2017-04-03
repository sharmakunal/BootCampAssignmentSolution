package a5;

import java.util.Scanner;

public class RemoveDuplicates {

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
	
	public static void removeDuplicate(Node<Integer> head)
	{
		Node<Integer> temp1=head, temp2=null;
		
		while(temp1!=null && temp1.next!=null)
		{
			temp2=temp1.next;
			while(temp1.data==temp2.data && temp2!=null)
			{
				temp2=temp2.next;
			}
			temp1.next=temp2;
			temp1=temp2;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
		
		System.out.println();
		removeDuplicate(head);
		print(head);
		
		s.close();
	}

}
