package a5;

import java.util.Scanner;

public class SwapTwoNodes {

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
	
	public static Node<Integer> swap(Node<Integer> head, int pos1, int pos2)
	{
		Node<Integer> prev1=head, prev2=head, temp1=null, temp2=null, temp3=null;
		int count1=1, count2=1;
		
		while(prev1!=null && count1!=pos1-1)
		{
			count1++;
			count2++;
			prev1=prev1.next;
			prev2=prev2.next;
		}
		
		temp1=prev1.next;
		
		while(prev2!=null && count2!=pos2-1)
		{
			count2++;
			prev2=prev2.next;
		}
		
		temp2=prev2.next;
		prev1.next=prev2.next;
		prev2.next=temp1;
		temp3=temp1.next;
		temp1.next=temp2.next;
		temp2.next=temp3;
		
		return head;
	}
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		Node<Integer> head=takeInput();
		print(head);
		
		System.out.print("\nEnter pos 1 : ");
		int pos1=s.nextInt();

		System.out.print("\nEnter pos 2 : ");
		int pos2=s.nextInt();

		head=swap(head, pos1, pos2);
		
		print(head);
		
		s.close();
	}

}
