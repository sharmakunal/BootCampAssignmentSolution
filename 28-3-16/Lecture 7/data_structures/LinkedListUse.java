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
	
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		print(head);
	//	head = insertAtIthR(head, 50, 2);
		head = bubbleSort(head);
		print(head);
	}

}
