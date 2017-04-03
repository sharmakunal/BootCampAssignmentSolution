package l11;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {
	
	static int preIndex=0;

	public static BinaryTreeNode<Integer> takeInput()
	{
		Scanner s= new Scanner(System.in);
		System.out.print("Enter root data : ");
		int rootData=s.nextInt();
		
		BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(rootData);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes=new QueueUsingLL<>();
		pendingNodes.enqueueLL(root);
		
		while(!pendingNodes.isEmpty())
		{
			BinaryTreeNode<Integer> currentNode=pendingNodes.dequeueLL();
			
			System.out.print("\nEnter left child of "+currentNode.data + " : ");
			int leftData=s.nextInt();
			
			if(leftData!=-1)
			{
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(leftData);
				pendingNodes.enqueueLL(leftChild);
				currentNode.left=leftChild;
			}
			
			System.out.print("\nEnter right child of "+ currentNode.data + " : ");
			int rightData=s.nextInt();
			
			if(rightData!=-1)
			{
				BinaryTreeNode<Integer> rightChild=new BinaryTreeNode<Integer>(rightData);
				pendingNodes.enqueueLL(rightChild);
				currentNode.right=rightChild;
			}
		}
		
		return root;
	}
	
	public static void print(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		
		String toBePrinted=root.data + " : ";
		
		if(root.left!=null)
			toBePrinted += root.left.data + " , ";
		
		if(root.right!=null)
			toBePrinted +=root.right.data ;
		
		System.out.println(toBePrinted);
		print(root.left);
		print(root.right);
	}
	
	public static Node<Integer> bstToSortedLL(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return null;
		
		Node<Integer> newNode=new Node<Integer>(root.data);
		Node<Integer> leftHead=bstToSortedLL(root.left);
		Node<Integer> rightHead=bstToSortedLL(root.right);
		Node<Integer> head=null;
		
		if(leftHead!=null)
		{
			head=leftHead;
			Node<Integer> temp=leftHead;
			while(temp.next!=null)
				temp=temp.next;
			temp.next=head;
		}
		else
			head=newNode;
		head.next=rightHead;
		return head;
		
	}

	public static BinaryTreeNode<Integer> buildBST(int[] arr, int first, int last)
	{
		if(first> last)
			return null;
		
		int mid=(first+last)/2;
		
		BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(arr[mid]);
		
		if(first==last)
			return newNode;
		
		newNode.left=buildBST(arr, first, mid-1);
		newNode.right=buildBST(arr, mid+1, last);
		
		return newNode;
	}
	
	public static BinaryTreeNode<Integer> buildFromPrenIn(int[] pre, int[] in, int startIn, int endIn)
	{
		
		if(startIn>endIn)
			return null;
		
		BinaryTreeNode<Integer> newNode= new BinaryTreeNode<Integer>(pre[preIndex]);
	
		int index=searchNum(in, pre[preIndex++], startIn, endIn);
		System.out.println("index is : "+index);
		newNode.left=buildFromPrenIn(pre, in, startIn, index-1);
		newNode.right=buildFromPrenIn(pre, in, index+1, endIn);
		
		return newNode;
	}
	
	public static int searchNum(int[] arr, int data, int start, int end)
	{
		for(int i=start;i<end;i++)
		{
			if(arr[i]==data)
				return i;
		}
		return -1;
	}
	
	//pre : 4 2 1 3 6 5 7 8
	//in : 1 2 3 4 5 6 7 8
	//	Binary tree : 5 6 9 7 8 10 -1 -1 -1 -1 -1 -1 -1
	//	Binary Search Tree : 50 40 60 -1 -1 55 65 51 57 -1 -1 -1 -1 -1 -1
	//  BST to find path : 10 5 15 4 7 11 18 2 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
	/*   Binary Search Tree 	*/	
	//	BinaryTreeNode<Integer> root=takeInput();
	//	System.out.println();
	//	print(root);
		
		
		System.out.print("Enter the size of array : ");
		int n1=sc.nextInt();
		
		int[] pre=new int[n1];
		
		System.out.println("\nEnter preorder array : ");
		for(int i=0;i<n1;i++)
		{
			pre[i]=sc.nextInt();
		}
		
		int[] in=new int[n1];
		
		System.out.println("\nEnter inorder array : ");
		for(int i=0;i<n1;i++)
		{
			in[i]=sc.nextInt();
		}
		
		BinaryTreeNode<Integer> newRoot=buildFromPrenIn(pre, in, 0, n1-1);
		print(newRoot);
		
		
		
		
		System.out.print("Enter the size of sorted array : ");
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("\nEnter sorted array : ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		BinaryTreeNode<Integer> root=buildBST(arr, 0, n-1);
		print(root);
	}
}
