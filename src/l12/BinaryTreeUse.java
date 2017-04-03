package l12;

import java.util.Scanner;

public class BinaryTreeUse {
	
	public static BinaryTreeNode<Integer> insert(BinaryTreeNode<Integer> root, int data)
	{
		BinaryTreeNode<Integer> newNode=new BinaryTreeNode<Integer>(data);
		
		if(root==null)
			root=newNode;
		else
		{
			if(data<root.data)
				root.left=insert(root.left,data);
			else if(data>root.data)
				root.right=insert(root.right, data);
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
	
	public static void main(String[] args)
	{
		BinaryTreeNode<Integer> root=null;
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("\nEnter the data : ");
		int data=s.nextInt();
		
		while(data!=-1)
		{
			root=insert(root, data);
			System.out.print("\nEnter the data : ");
			data=s.nextInt();
		}
		
		print(root);
		
		s.close();
	}

}
