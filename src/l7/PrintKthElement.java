package l7;

import java.util.Scanner;

public class PrintKthElement {
	public static Node<Integer> takeInput()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nEnter data : ");
		Node<Integer> head=null;
	//	Node<Integer> tail=null;
		
		int data=s.nextInt();
		
		while(data!=-1)
		{
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null)
			{
				head=newNode;
		//		tail=newNode;
			}
			else
			{
//				tail.next=newNode;
//				tail=newNode;
				
				Node<Integer> temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
			}
			
			System.out.print("\nEnter data : ");
			data=s.nextInt();
		}
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
	
	public static void printKvalue(Node<Integer> head, int k)
	{
		int count =0;
		while(head!=null)
		{
			count++;
			if(count==k)
			{
				System.out.print(head.data + "->");
				break;
			}
			head=head.next;
		}
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
		print(head);
		
		System.out.print("Enter the 'k'th value you want to find : ");
		int k=s.nextInt();
		
		printKvalue(head, k);
		
		s.close();
	}

}
