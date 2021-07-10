package BinaryTree1;

public class BSTclas {
	private BinaryTreeNode<Integer> root;
	private int size;


	//all functions are of O(height), so it is necessary to maintained tree balanced
	//if height is n then all benifits of BST will go
	//otherwise it is awsome if tree is balanced
	private boolean isPresentHelper(BinaryTreeNode<Integer> root2, int x) {
		if(root2 == null) {
			return false;
		}
		
		if(root2.data == x) {
			return true;
		}

		if(x < root2.data) {
			return isPresentHelper(root2.left, x);
		}else {

			return isPresentHelper(root2.right, x);
		}
	}

	public boolean isPresent(int x) {
		return isPresentHelper(root,x);
	}


	private static void printTreeHelper(BinaryTreeNode<Integer> root) {
		if(root == null) {
		return;
		}
		String toBePrinted = root.data + "->";
		if(root.left != null) {
			toBePrinted += " " + "L:" + root.left.data + ",";
		}
		if(root.right != null) {
			toBePrinted += " " + "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTreeHelper(root.left);
		printTreeHelper(root.right);
	}
	public void printTree() {
		printTreeHelper(root);
	}

	
	private static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> node, int x) {
		if(node == null) {
			BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(x);
			return root;
		}
		
		if(x >= node.data) {
			node.right = insertHelper(node.right, x);
		}else {
			node.left = insertHelper(node.left, x);
		}
		
		return node;
	}
	public void insert(int x){
		root =  insertHelper(root, x);
		size++;
	}
	
	public int size() {
		return size;
	}

	private static BSTdeleteReturn deleteHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return new BSTdeleteReturn(null, false);
		}
		
		if(root.data < x) {
			BSTdeleteReturn outRight = deleteHelper(root.right, x);
			root.right = outRight.root;
			outRight.root = root;
			return outRight;
		}
		
		if(root.data > x) {
			BSTdeleteReturn outLeft = deleteHelper(root.left, x);
			root.left = outLeft.root;
			outLeft.root = root;
			return outLeft;
		}
		
		//0 children
		if(root.left == null && root.right == null) {
			return new BSTdeleteReturn(null, true);
		}
		
		//only left child
		if(root.left != null && root.right == null) {
			return new BSTdeleteReturn(root.left, true);
		}
		
		//only right child
		if(root == null & root.right != null) {
			return new BSTdeleteReturn(root.right, true);
		}
		
		//when both children are present 
		int rightMin = minimum(root.right);
		root.data = rightMin;
		BSTdeleteReturn outRight = deleteHelper(root.right, rightMin);
		root.right = outRight.root;
		return new BSTdeleteReturn(root, true);
	}
	
	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftHeight = minimum(root.left);
		int rightHeight = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftHeight, rightHeight));
	}
	public boolean delete(int x) {
		BSTdeleteReturn ans = deleteHelper(root,x);
		root = ans.root;
		if(ans.deleted) {
			size--;
		}
		return ans.deleted;
	}

}
