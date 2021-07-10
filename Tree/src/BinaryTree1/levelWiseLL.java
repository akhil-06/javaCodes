package BinaryTree1;

import java.util.ArrayList;
import java.util.Scanner;

public class levelWiseLL {
	
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

	public static ArrayList<Node<Integer>> levelWiseLL(BinaryTreeNode<Integer> root){
		if(root == null) {
			return null;
		}
		queueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new queueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		while(!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> temp = null;
			try {
				temp = pendingNodes.dequeue();
			} catch (queueEmptyException e) {
				//not come
			}
		}
		
//		Node<Integer> rootLL = 
		
	}
	
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInput();
		
	}

}
