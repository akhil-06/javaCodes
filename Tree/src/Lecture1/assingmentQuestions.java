package Lecture1;

import java.util.Scanner;

public class assingmentQuestions {
	
	public static treeNodeClass<Integer> takeInputLevelWise(){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		queueUsingLL<treeNodeClass<Integer>> pendingNodes = new queueUsingLL<>();
		treeNodeClass<Integer> root = new treeNodeClass<Integer>(rootData);
		pendingNodes.enqueue(root);
		while(!pendingNodes.isEmpty()) {
			try {
				treeNodeClass<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter no. of children of" + frontNode.data);
				int numChildren = s.nextInt();
				for(int i=0;i<numChildren;i++) {
					System.out.println("Enter " + (i+1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					treeNodeClass<Integer> childNode = new treeNodeClass<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (queueEmptyException e) {
				//this is not come
				return null;
			}
		}
		return root;
	}
	
	public static boolean containsX(treeNodeClass<Integer> root, int x) {
		if(root == null) {
			return false;
		}
		if(root.data == x) {
			return true;
		}
		
		
		for(int i=0; i< root.children.size(); i++) {
			boolean ans =  containsX(root.children.get(i), x);
			
			if(ans == true) {
				return true;
			}
		}
		return false;
	}
	
	public static int numNodeGreater(treeNodeClass<Integer> root, int x) {
		if(root == null) {
			return 0;
		}
		
		int count = 0;
		if(root.data > x) {
			count++;
		}
		for(int i=0; i < root.children.size(); i++) {
			count += numNodeGreater(root.children.get(i), x);
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNodeClass<Integer> root = takeInputLevelWise();
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		boolean ans  = containsX(root,x);
		System.out.println(ans);
		
		System.out.print("Enter x1 to find greater nodes = ");
		int x1 = s.nextInt();
		int countNodes = numNodeGreater(root, x1);
		System.out.println("Nodes with greater than x -> " + countNodes);
	}

}
