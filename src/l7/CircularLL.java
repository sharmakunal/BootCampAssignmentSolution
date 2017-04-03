package l7;

import java.util.Scanner;

public class CircularLL {
	
	public static Node<Integer> takeInput(Node<Integer> head)
	{
		Scanner s=new Scanner(System.in);
		Node<Integer> tail=null;
		
		System.out.print("Enter the data : ");
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
				newNode.next=head;
				tail.next=newNode;
				tail=newNode;
			}
			System.out.print("Enter the data : ");
			data=s.nextInt();
		}
		
		s.close();
		return head;
	}
	
	public static void print(Node<Integer> head)
	{
		Node<Integer>temp=head;
		while(temp!=null && temp.next!=head)
		{
			System.out.print(temp.data+ "->");
			temp=temp.next;
		}
		System.out.print(temp.data+"->1");
	}
	
	public static void main(String[] args)
	{
		
		
		Node<Integer> head=null;
		head=takeInput(head);
		print(head);
			
	}

}
