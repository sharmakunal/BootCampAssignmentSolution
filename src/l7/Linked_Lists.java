package l7;

import java.util.Scanner;

public class Linked_Lists {
	
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
//				Node<Integer> temp=head;
//				while(temp.next!=null)
//				{
//					temp=temp.next;
//				}
//				temp.next=newNode;
				tail.next=newNode;
				tail=newNode;
				
			}
			
			System.out.print("\nEnter data : ");
			data=s.nextInt();
		}
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

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		print(head);

	}

}
