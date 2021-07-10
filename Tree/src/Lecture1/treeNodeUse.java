package Lecture1;

import java.util.Scanner;

public class treeNodeUse {
	
	//take input from user, we are doing 
	//taking root data, then asking no. of children of root, then we go to every child and call recusrion on that
	//and atlast we add the values in our ArrayList
	public static treeNodeClass<Integer> takeInput(Scanner s){
		System.out.println("enter data of next node");
		int n = s.nextInt();
		treeNodeClass<Integer> root = new treeNodeClass<Integer>(n);
		System.out.println("enter children for" + n);
		int children = s.nextInt();
		for(int i=0;i<children;i++) {
			treeNodeClass<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}

	
	
	public static void printTree(treeNodeClass<Integer> root) {
		String s = root.data + ":";
		for(int i=0; i<root.children.size();i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		
		for(int i=0; i<root.children.size();i++) {
			printTree(root.children.get(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		treeNodeClass<Integer> root = takeInput(s);
		printTree(root);
		
//		treeNodeClass<Integer> root = new treeNodeClass<Integer>(4);
//		treeNodeClass<Integer> node1 = new treeNodeClass<Integer>(5);
//		treeNodeClass<Integer> node2 = new treeNodeClass<Integer>(6);
//		treeNodeClass<Integer> node3 = new treeNodeClass<Integer>(7);
//		treeNodeClass<Integer> node4 = new treeNodeClass<Integer>(8);
//		
//		root.children.add(node1);
//		root.children.add(node2);
//		root.children.add(node3);
//		
//		node2.children.add(node4);
//		System.out.println(root);
	}

}
