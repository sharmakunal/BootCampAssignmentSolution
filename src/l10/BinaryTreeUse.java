package l10;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {

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
	
	public static void mirror(BinaryTreeNode<Integer> root)
	{
		
		if(root==null)
			return ;
		
		BinaryTreeNode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		
		mirror(root.left);
		mirror(root.right);
	
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
	
	public static BinaryTreeNode<Integer> findNode(BinaryTreeNode<Integer> root, int data)
	{
		if(root == null)
			return null;
		if(root.data==data)
			return root;
		
		BinaryTreeNode<Integer> found =findNode(root.left, data);
		if(found!=null)
			return found;
		return findNode(root.right, data);
	}
	
	
	public static int height(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return 0;
		return 1 +Math.max(height(root.left), height(root.right));
	}
	
	//O(height*n)
	public static int diameter(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return  0;
		
		int leftDiameter=diameter(root.left);
		int rightDiameter=diameter(root.right);
		int heightSum=height(root.left) +height(root.right) +1;
		
		return Math.max(heightSum, Math.max(leftDiameter,rightDiameter));
	}
	
	//O(n)
	public static DiamterReturnType diameterBetter(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			DiamterReturnType ans=new DiamterReturnType();
			ans.diameter=0;
			ans.height=0;
			return ans;
		}
		
		DiamterReturnType leftAns=diameterBetter(root.left);
		DiamterReturnType rightAns=diameterBetter(root.right);
		int heightSum=leftAns.height +rightAns.height +1;
		
		DiamterReturnType ans=new DiamterReturnType();
		ans.diameter=Math.max(heightSum, Math.max(leftAns.diameter, rightAns.diameter));
		ans.height=Math.max(leftAns.height, rightAns.height)+1;
		
		return ans;
	}

	public static BinaryTreeNode<Integer> findNodeBST(BinaryTreeNode<Integer> root, int data)
	{
		if(root==null)
			return null;
		if(root.data==data)
			return root;
		if(root.data>data)
			findNodeBST(root.left, data);
		else
			findNodeBST(root.right, data);
		return null;
	}
	
	public static void printInRange(BinaryTreeNode<Integer> root, int lb, int up)
	{
		if(root==null)
			return ;
		if(lb==up &&root.data==lb)
			System.out.print(root.data+ "  ");
		if(up<lb)
			return;
		if(root.data>=lb && root.data<=up)
		{
			printInRange(root.left, lb, up);
			System.out.print(root.data + "  ");
			printInRange(root.right, lb, up);
		}
	}
	
	public static Pair<Integer> checkBST_Better1(BinaryTreeNode<Integer> root)	//	O(n)
	{
		Pair<Integer> p=new Pair<>();
		
		if(root==null)
		{
			p.min=Integer.MAX_VALUE;
			p.max=Integer.MIN_VALUE;
			p.isBST=true;
			return p;
		}
		
		Pair<Integer> p1=new Pair<>();
		Pair<Integer> p2=new Pair<>();
		
		p1=checkBST_Better1(root.left);
		p2=checkBST_Better1(root.right);

		if( p1.max<root.data && p2.min>root.data && p1.isBST && p2.isBST )
		{
			p.max=Math.max(root.data, p2.max);
			p.min=Math.min(root.data, p1.min);
			p.isBST=true;
			return p;
		}

		p.min=Math.max(root.data, p2.max);
		p.max=Math.min(root.data, p1.min);
		p.isBST=false;
		return p;	
	}
	
	public static boolean checkBST_Better2(BinaryTreeNode<Integer> root, int min, int max)
	{
		if(root==null)
			return true;
		if(root.data<min || root.data>max)
			return false;
		return checkBST_Better2(root.left, min, root.data) && checkBST_Better2(root.right, root.data+1, max);
	}
	
	public static boolean checkBST(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return true;
		}
		
		if(checkBST(root.left) && checkBST(root.right))
		{
			int leftMax=max(root.left);
			int rightMin=min(root.right);
			if(leftMax<root.data && rightMin> root.data)
				return true;
		}
		return false;
	}
	
	public static int max(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MIN_VALUE;
		}
		
		return Math.max(root.data, Math.max(max(root.left), max(root.right)));
	}
	
	public static int min(BinaryTreeNode<Integer> root)
	{
		if(root==null)
		{
			return Integer.MAX_VALUE;
		}
		
		return Math.min(root.data, Math.min(min(root.left), min(root.right)));
	}
	
	public static ArrayList<BinaryTreeNode<Integer>> findPath(BinaryTreeNode<Integer> root, int data)
	{
		
		if(root==null)
			return null;
		
		if(root.data==data)
		{
			ArrayList<BinaryTreeNode<Integer>> path=new ArrayList<>();
			path.add(root);
			return path;
		}
		
		ArrayList<BinaryTreeNode<Integer>> leftPath=findPath(root.left, data);
		if(leftPath!=null)
		{
			leftPath.add(0,root);
			return leftPath;
		}
		
		ArrayList<BinaryTreeNode<Integer>> rightPath=findPath(root.right, data);
		if(rightPath!=null)
		{
			rightPath.add(0,root);
			return rightPath;
		}
		return null;
	}
	
	//	Binary tree : 5 6 9 7 8 10 -1 -1 -1 -1 -1 -1 -1
	//	Binary Search Tree : 50 40 60 -1 -1 55 65 51 57 -1 -1 -1 -1 -1 -1
	//  BST to find path : 10 5 15 4 7 11 18 2 -1 -1 -1 -1 -1 -1 -1 -1 -1 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
/*		Binary Tree		 */
		
//		BinaryTreeNode<Integer> root=takeInput();
//		print(root);
		
//		System.out.println("Mirror image is : ");
//		mirror(root);
//		print(root);
//		
//		System.out.println("\nHeight of tree  is : "+ height(root));
//		
//		System.out.println("\nDiameter of tree is : "+diameter(root));
//		System.out.println("\nDiameter better of tree is : "+diameterBetter(root).diameter);
//		
//		System.out.print("\nEnter the value to find in tree : ");
//		int data=sc.nextInt();
//		
//		if(findNode(root, data)==null)
//			System.out.println("Node not Found");
//		else
//			System.out.println("Node found");
	
	/*   Binary Search Tree 	*/	
		BinaryTreeNode<Integer> root=takeInput();
		System.out.println();
		print(root);
		
		System.err.print("\nEnter the node whos path you want to find : ");
		int n=sc.nextInt();
		
		System.out.print(" path is  : ");
		ArrayList<BinaryTreeNode<Integer>> arr=new ArrayList<>();
		arr=findPath(root,n);
		
		for(int i=0;i<arr.size();i++)
		{
			System.out.print(arr.get(i).data+" ->");
		}
		
		System.out.println("\nThe given tree is BST  : " + checkBST(root));
		System.out.println("\nThe given tree is BST  : " + checkBST_Better1(root).isBST);
		System.out.println("\nThe given tree is BST  : " + checkBST_Better2(root,Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		System.out.print("\nEnter lower bound : ");
		int lb=sc.nextInt();
		
		System.out.print("\nEnter upper bound : ");
		int up=sc.nextInt();
		
		printInRange(root, lb, up);
		
		System.out.print("\nEnter element to find in BST  : ");
		int data=sc.nextInt();
		
		if(findNode(root, data)==null)
			System.out.println("\nNode not found");
		else
			System.out.println("Node found");
	}
}
