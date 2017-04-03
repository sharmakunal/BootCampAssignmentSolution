package l7;

import java.util.Scanner;

public class bubbleSortLinkedList {
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
		return head;
	}
	
	public static void sort(Node<Integer> head)
	{
		Node<Integer> temp=head;
		Node<Integer> temp2=head.next;
	/*	
		for(temp=head; temp.next.next!=null;temp=temp.next)
			for(temp2=head;temp.next!=null)
			
			
			
			
			
			for(i=0;i<n-1;i++)
			{
				for(j=0;j<n-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}*/
	
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
		
		s.close();
	}
}
