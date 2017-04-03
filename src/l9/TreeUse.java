package l9;

import java.util.Scanner;

public class TreeUse {
	
	public static TreeNode<Integer> takeInputLevelWise()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter root data : ");
		int rootData=s.nextInt();
		TreeNode<Integer> root=new TreeNode<Integer>(rootData);
		
		QueueUsingLL<TreeNode<Integer>> pendingNode=new QueueUsingLL<>();
		pendingNode.enqueueLL(root);
		
		while(!pendingNode.isEmpty())
		{
			TreeNode<Integer> currentNode=pendingNode.dequeueLL();
			System.out.print("\nEnter number of childred of "+currentNode.data);
			int numChild=s.nextInt();
			
			for(int i=0;i<numChild;i++)
			{
				System.out.print("\nEnter "+ i+" child of "+currentNode.data);
				int childData=s.nextInt();
				TreeNode<Integer> child=new TreeNode<Integer>(childData);
				pendingNode.enqueueLL(child);
				currentNode.children.add(child);
			}
		}
		
		return root;
	}
	
	public static void printDepthWiseRecursive(TreeNode<Integer> root)
	{
		String toBePrinted=root.data+" : ";
		
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> currentChild=root.children.get(i);
			toBePrinted+= currentChild.data+" , ";
		}
		System.out.print("\n"+toBePrinted);
		
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> currentChild=root.children.get(i);
			printDepthWiseRecursive(currentChild);
		}
	}

	public static int countNodes(TreeNode<Integer>root)
	{
		if(root==null)
			return 0;
		
		int count=1;
		
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> currentChild=root.children.get(i);
			count += countNodes(currentChild);
		}
		return count;
	}
	
	public static int sumNodes(TreeNode<Integer>root)
	{
		if(root==null)
			return 0;
		int sum=root.data;
		
		for(int i=0;i<root.children.size();i++)
		{
			TreeNode<Integer> cuurentChild=root.children.get(i);
			sum+=sumNodes(cuurentChild);
		}
		return sum;
	}
	
	public static int height(TreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		
		int maxChildHeight=0;
		
		for(int i=0;i<root.children.size();i++)
		{
			
			TreeNode<Integer> currentChild=root.children.get(i);
			int childHeight=height(currentChild);
			
			if(childHeight>maxChildHeight)
				maxChildHeight=childHeight;
	
		}
		
		return 1+maxChildHeight;
	}
	
	//10 3 15 20 30 0 1 40 0 0
	public static void main(String[] args) {
		
		TreeNode<Integer> root=takeInputLevelWise();
		printDepthWiseRecursive(root);
		System.out.println("count is : "+ countNodes(root));
		System.out.println("sum is : "+ sumNodes(root));
		System.out.println("height is : "+ height(root));
	}

}
