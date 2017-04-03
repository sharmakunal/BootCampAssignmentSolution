package data_structures;

import java.util.Scanner;

public class LinkedListUse {

	public static Node<Integer>  takeInput(){

		Scanner s = new Scanner(System.in);
		System.out.println("Enter data :");
		Node<Integer> head = null,tail = null;
		int data = s.nextInt();
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}
			else{
				tail.next = newNode;
				tail = newNode;	
			}	
			System.out.println("Enter data :");
			data = s.nextInt();
		}
		return head;
	}


	public static void print(Node<Integer> head){

		Node<Integer> temp = head;
		while(temp != null){
			System.out.print(temp.data+"->");
			temp = temp.next;
		}	
		System.out.println();
	}

	
	public static Node<Integer> insertAtIthR(Node<Integer> head, int data, int pos){
		
		if(pos == 0){
			Node<Integer> newNode = new Node<Integer>(data);
			newNode.next = head;
			return newNode;
	
		}
		head.next = insertAtIthR(head.next, data, pos-1);
		return head;
	}
	
	public static int length(Node<Integer> head){
		return head == null ? 0 : 1 + length(head.next);
	}
	
	public static Node<Integer> bubbleSort(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		
		int len = length(head);
		for(int i = 0; i < len; i++){
			Node<Integer> currentNode = head;
			Node<Integer> prev = null;
			while(currentNode.next != null){
				if(currentNode.data > currentNode.next.data){
					if(prev == null){
						Node<Integer> next = currentNode.next;
						currentNode.next = next.next;
						next.next = currentNode;
						prev = next;	
						head = next;
					}
					else{
						Node<Integer> next = currentNode.next;
						currentNode.next = next.next;
						next.next = currentNode;
						prev.next = next;
						prev = prev.next;
					}
				}
				else{
					prev = currentNode;
					currentNode = currentNode.next;	
				}
			}
		}
		return head;
	}
	
	public static Node<Integer> mergeSort(Node<Integer> head){
		
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> mid = mid(head);
		Node<Integer> part1 = head;
		Node<Integer> part2 = mid.next;
		mid.next = null;
		part1 = mergeSort(part1);
		part2 = mergeSort(part2);
		head = merge(part1, part2);
 		return head;
	}
	
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
		if(head1 == null){
			return head2;
		}
		if(head2 == head1){
			return head1;
		}
		Node<Integer> head = null,tail = null;
		if(head1.data < head2.data){
			head = head1;
			tail = head1;
			head1 = head1.next;
		}
		else{
			head = head2;
			tail = head2;
			head2 = head2.next;
		}
		
		while(head1 != null && head2 != null){
		
			if(head1.data < head2.data){
				tail.next = head1;
				tail = head1;
				head1 = head1.next;
			}
			else{
				tail.next = head2;
				tail = head2;
				head2 = head2.next;
			}		
		}
		if(head1 != null){
			tail.next = head1;
		}
		if(head2 != null){
			tail.next = head2;
		}
		return head;
	}
	
	
	public static Node<Integer> mid(Node<Integer> head){
		if(head == null || head.next == null){
			return head;
		}
		Node<Integer> slow = head, fast = head;	
		while(fast.next  != null && fast.next.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	
	public static void main(String[] args) {
		Node<Integer> head1 = takeInput();
		print(head1);
//		Node<Integer> mid = mid(head1);
//		System.out.println(mid.data);
		head1 = mergeSort(head1);
		print(head1);
		
	//	head = insertAtIthR(head, 50, 2);
//		head = bubbleSort(head);
//		print(head);
//		Node<Integer> head2 = takeInput();
//		Node<Integer> head = merge(head1, head2);
//		print(head);
		
	}

}
