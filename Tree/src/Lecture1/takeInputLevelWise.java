 package Lecture1;

import java.util.Scanner;

public class takeInputLevelWise {

	public static treeNodeClass<Integer> takeInputlevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		queueUsingLL<treeNodeClass<Integer>> pendingNodes = new queueUsingLL<>();
		treeNodeClass<Integer> root = new treeNodeClass<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				treeNodeClass<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter no of children of" + frontNode.data);
				int numChildren = s.nextInt();
				for(int i=0; i<numChildren;i++) {
					System.out.println("Enter " + (i+1) + "th child of " + frontNode.data);
					int child  = s.nextInt();
					treeNodeClass<Integer> childNode = new treeNodeClass<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}

			} catch (queueEmptyException e) {
				//this shouldn't come 
				return null;
			}
		}
		return root;
	}

	public static void printLevelWise(treeNodeClass<Integer> root) {
		if(root == null) {
			return;
		}
		queueUsingLL<treeNodeClass<Integer>> pendingNodes = new queueUsingLL<treeNodeClass<Integer>>();
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			treeNodeClass<Integer> temp = null;
			try {
				temp = pendingNodes.dequeue();
			} catch (queueEmptyException e) {
			}
			System.out.print(temp.data + ": ");
			for(int i=0; i<temp.children.size();i++) {
				System.out.print(temp.children.get(i).data);
				if(i < temp.children.size() -1) {
					System.out.print(",");
				}
				pendingNodes.enqueue(temp.children.get(i));
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNodeClass<Integer> root = takeInputlevelWise();
		printLevelWise(root);

	}

}
