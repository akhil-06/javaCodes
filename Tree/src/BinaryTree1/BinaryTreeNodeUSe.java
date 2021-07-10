package BinaryTree1;

import java.util.Scanner;

public class BinaryTreeNodeUSe {

	//full explain in the notes how it works,  Refer them...

	public static BinaryTreeNode<Integer> takeInput(Scanner s){
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
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

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		queueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new queueUsingLL<>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> temp = null;
			try {
				temp = pendingNodes.dequeue();
			} catch (queueEmptyException e) {
				//will not come 
				return;
			}
			System.out.print(temp.data + ": L:");

			if(temp.left != null) {
				pendingNodes.enqueue(temp.left);
				System.out.print(temp.left.data + ",R:");
			}else {
				System.out.print(-1 + ",R:");
			}
			
			if(temp.right != null) {
				pendingNodes.enqueue(temp.right);
				System.out.println(temp.right.data);
			}else {
				System.out.println(-1);
			}
		}
	}


	public static void main(String[] args) {
		//		?Scanner s = new Scanner(System.in);
		//		BinaryTreeNode<Integer> root = takeInput(s);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printBT(root);
		printLevelWise(root);
		//		s.close();
		//		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(1);
		//		root.left = node1;
		//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(1);
		//		root.right = node2;
	}

}
