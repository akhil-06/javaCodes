package BinaryTree1;

import java.util.Scanner;

public class someMoreQuestions {
	
	public static BinaryTreeNode<Integer> takeInput(){
		Scanner s = new Scanner(System.in);
		queueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new queueUsingLL<>();
		System.out.println("Enter root data ");
		int rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (queueEmptyException e) {
				//this situation will not come
				return null;
			}
			System.out.println("Enter left child of" + front.data);
			int leftChild = s.nextInt();
			if(leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}

			System.out.println("Enter right child of" + front.data);
			int rightChild = s.nextInt();
			if(rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}

	public static BinaryTreeNode<Integer> removeLeafs(BinaryTreeNode<Integer> root) {
		if(root == null){
			return null;
		}
		if(root.left == null && root.right == null) {
			return null;
		}
		
//		//by doing this we 1->2 1 is attached to 2 we havent remove the 2
//		removeLeafs(root.left);
//		removeLeafs(root.right);
		//so we do
		root.left = removeLeafs(root.left);
		root.right = removeLeafs(root.right);
		
		return root;
	}
	
	public static void printBT(BinaryTreeNode<Integer> root) {
		//base case
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
		printBT(root.left);
		printBT(root.right);
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		//in this case we have to find height and then check for height for checking is lH-Rh is <=1
		int Leftheight = height(root.left);
		int rightHeight = height(root.right);
		
		if(Math.abs(Leftheight - rightHeight) > 1) {
			return false;
		}
		
		//if height is <=1, then we have to check for every node is balanced or not
		boolean left = checkBalanced(root.left);
		boolean right = checkBalanced(root.right);
		
//		if(left && right) {
//			return true;
//		}
//		return false;
		return left && right;
		
	}
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}

	
	public static balancedBTpair isBalancedBTBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			balancedBTpair ans = new balancedBTpair();
			ans.height = 0;
			ans.isBalanced = true;
			return ans;
		}
		
		balancedBTpair left = isBalancedBTBetter(root.left);
		balancedBTpair right = isBalancedBTBetter(root.right);
		
		
		int height = 1 + Math.max(left.height, right.height);
		int leftheight = left.height;
		int rightheight = right.height;
		boolean isBal = true;
		if(Math.abs(leftheight - rightheight) > 1) {
			isBal = false;
		}
		if(!left.isBalanced || !right.isBalanced) {
			isBal = false;
		}
		
		balancedBTpair ans = new balancedBTpair();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}
	
	public static maxMinPair maxMin(BinaryTreeNode<Integer> root) {
		if(root == null) {
			maxMinPair out = new maxMinPair();
			out.maxi = Integer.MIN_VALUE;
			out.mini = Integer.MAX_VALUE;
			return out;
		}
		maxMinPair left = maxMin(root.left);
		maxMinPair right = maxMin(root.right);
		
		int maxi = Math.max(root.data,Math.max(left.maxi, right.maxi));
		int mini = Math.min(root.data,Math.min(left.mini, right.mini));
		
		maxMinPair out = new maxMinPair();
		out.maxi = maxi;
		out.mini = mini;
		return out;
		
	}
	
	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		BinaryTreeNode<Integer> copy=new BinaryTreeNode<>(root.data);
        
        insertDuplicateNode(root.left);

            insertDuplicateNode(root.right);
             BinaryTreeNode<Integer> temp= root.left;
             root.left=copy;
             copy.left=temp;
	
	}
	
	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null){
			return 0;
		}
		
		int sum = root.data;
		
		sum += sumOfNodes(root.left);
		sum += sumOfNodes(root.right);
		
		return sum;
	}
	
	public static void nodeWithoutSiblingd(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		
		if(root.left == null && root.right != null) {
			System.out.print(root.right.data + " ");
		
		}else if(root.left != null && root.right == null) {
			System.out.print(root.left.data +  " ");
		}
		nodeWithoutSiblingd(root.left);
		nodeWithoutSiblingd(root.right);
		
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		printBT(root);
		System.out.println();
		 BinaryTreeNode<Integer> newRoot = removeLeafs(root);
		printBT(newRoot);
		System.out.println();
		boolean ans = checkBalanced(newRoot);
		System.out.println(ans);
		System.out.println(isBalancedBTBetter(root).isBalanced);
		System.out.println();
		insertDuplicateNode(root);
		printBT(root);
		maxMinPair ans1 = new maxMinPair();
		System.out.println("Maximum of all nodes -> " +maxMin(root).maxi);
		System.out.println("Minimum of all nodes -> " + maxMin(root).mini);
		System.out.println("Sum of all nodes -> " + sumOfNodes(root));
		nodeWithoutSiblingd(root);
	}

}
