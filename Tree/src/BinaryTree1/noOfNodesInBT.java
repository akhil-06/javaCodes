package BinaryTree1;

import java.util.Scanner;

public class noOfNodesInBT {

	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		queueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new queueUsingLL<>();
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
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

	public static int noOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}

		int left = noOfNodes(root.left);
		int right = noOfNodes(root.right);
		return 1 + left + right;
	}

	public static int sumOfNodes(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int sum =0;
		int leftSUm = sumOfNodes(root.left);
		int rightSUm = sumOfNodes(root.right);
		return root.data + leftSUm + rightSUm;

	}

	public static void printPreOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		printPreOrder(root.left);
		printPreOrder(root.right);
	}

	public static void printPostOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}

		printPostOrder(root.left);
		printPostOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void pritnInOrder(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		pritnInOrder(root.left);
		System.out.print(root.data + " ");
		pritnInOrder(root.right);
	}

	public static int maxNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
	

		int left = maxNode(root.left);
		int right = maxNode(root.right);
		
		
		return Math.max(root.data, Math.max(left, right));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		int nodes = noOfNodes(root);
		int sumnodes = sumOfNodes(root);
		System.out.println("No of Nodes in BT ->" + nodes);
		System.out.println("Sum of Nodes in BT ->" + sumnodes);
		printPreOrder(root);
		System.out.println();
		printPostOrder(root);
		System.out.println();
		pritnInOrder(root);
		System.out.println();

		int maxData = maxNode(root);
		System.out.println("Max Node data -> " + maxData);
	}

}
