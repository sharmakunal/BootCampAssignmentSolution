package l10;

public class Questions {

	
	public static  void duplicateNode(BinaryTreeNode<Integer> root){
		if(root == null){
			return;
		}
		
		duplicateNode(root.left);
		duplicateNode(root.right);
		BinaryTreeNode<Integer> newLeft = new BinaryTreeNode<Integer>(root.data);
		newLeft.left = root.left;
		root.left = newLeft;
	}
	
	
	public static BinaryTreeNode<Integer> constructTreeFromPreIn(int[] pre,
			int[] in, int preS, int preE, int inS, int inE){
	
		if(inS > inE){
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(pre[preS]);
		
		int index = inS;
		while(index <= inE){
			if(in[index] == root.data){
				break;
			}
			index++;
		}
		
		int leftInS = inS ;
		int leftInE = index - 1;
		int rightInS = index + 1;
		int rightInE  = inE;
		
		int leftPreS = preS + 1;
		int rightPreE = preE;
		
		int leftInLength = leftInE - leftInS + 1;
		int leftPreE = leftPreS + leftInLength - 1;
		int rightPreS = leftPreE + 1;
		
		root.left = constructTreeFromPreIn(pre, in, leftPreS,leftPreE,
				leftInS,leftInE);
		root.right = constructTreeFromPreIn(pre, in, rightPreS,rightPreE,
				rightInS,rightInE);
		
		return root;
	}
	
//	public static Pair<Node<BinaryTreeNode<Integer>> bstToSortedLL(BinaryTreeNode<Integer> root){
//		if(root == null){
//			
//			
//			return null;
//		}
//		Node<BinaryTreeNode<Integer>> rootNode = new Node<BinaryTreeNode<Integer>>(root);
//		Node<BinaryTreeNode<Integer>> leftHead = bstToSortedLL(root.left);
//		
//		Node<BinaryTreeNode<Integer>> rightHead = bstToSortedLL(root.right);
//		
//	}
	
	
	// 6 2 10 1 -1 7 -1 -1 -1 -1 -1 -1 -1
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = BinaryTreeUse.takeInput();
//		duplicateNode(root);
//		BinaryTreeUse.print(root);
		
		int[] in = {7,2,1,5,6,9,5};
		int[] pre = {5,2,7,1,9,6,5};
		BinaryTreeNode<Integer> root = constructTreeFromPreIn(pre, in,
				0, pre.length - 1, 0, in.length - 1);
		BinaryTreeUse.print(root);
		
		
	}

}
