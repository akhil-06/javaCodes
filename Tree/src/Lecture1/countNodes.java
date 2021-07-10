package Lecture1;

import java.util.Scanner;

public class countNodes {

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

	public static int numOfNodesTree(treeNodeClass<Integer> root) {
		//this is not a base case, this is edge case if user gives null then what??
		//here base case is when 1 node but becasue of for loop we dont want base case, if root is 1
		//then it wont go to loop and we return
		if(root== null) {
			return 0;
		}
		//count is 1 because it is for root
		int count = 1;
		for(int i=0;i<root.children.size();i++) {
			count = count + numOfNodesTree(root.children.get(i));
		}
		return count;
	}

	public static int sumOfNodes(treeNodeClass<Integer> root) {
		if(root== null) {
			return 0;
		}
		int sum = root.data;
		for(int i=0;i<root.children.size();i++) {
			sum += sumOfNodes(root.children.get(i));
		}
		return sum;
	}

	public static int maxNodeData(treeNodeClass<Integer> root) {
		if(root== null) {
			return Integer.MIN_VALUE;
		}
		int max = root.data;

		for(int i=0;i<root.children.size();i++) {
			int maxNode = maxNodeData(root.children.get(i));
			if(maxNode > max) {
				max = maxNode;
			}
		}
		return max;
	}

	public static int heightofTree(treeNodeClass<Integer> root) {
		if(root == null) {
			return 0;
		}
		int height = 0;
		for(int i=0;i<root.children.size();i++) {
			int childheight = heightofTree(root.children.get(i));
			if(childheight > height) {
				height = childheight;
			}
		}
		return height+1;
	}

	public static void printAtK(treeNodeClass<Integer> root, int k) {
		if(k < 0) {
			return;
		}
		if(k == 0) {
			System.out.println("Nodes at level is -> "+ root.data);
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			printAtK(root.children.get(i), k-1);
		}
	}

	public static int leafCountOfTree(treeNodeClass<Integer> root) {
		if(root == null) {
			return 0;
		}
		if(root.children.size() == 0) {
			return 1;
		}
		int leaf = 0;
		for(int i=0;i<root.children.size();i++) {
			leaf += leafCountOfTree(root.children.get(i));
		}
		return leaf;
	}

	public static void printPreorder(treeNodeClass<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for(int i=0;i < root.children.size();i++) {
			printPreorder(root.children.get(i));
		}
	}

	public static void printPostorder(treeNodeClass<Integer> root) {
		if(root == null) {
			return;
		}
		for(int i=0;i < root.children.size();i++) {
			printPostorder(root.children.get(i));
		}
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treeNodeClass<Integer> root = takeInputLevelWise();
		int noOfNodes = numOfNodesTree(root);
		int sumOfNodes = sumOfNodes(root);
		int maxData = maxNodeData(root);
		int heightOfTree = heightofTree(root);
		int leafCount = leafCountOfTree(root);
		System.out.println("Number of nodes in tree -> " + noOfNodes);
		System.out.println("Sum of all nodes in tree -> " + sumOfNodes);
		System.out.println("Max Node Data ->" + maxData);
		System.out.println("Height of tree is ->" + heightOfTree);
		//		Scanner s = new Scanner(System.in);
		//		int k = s.nextInt();
		printAtK(root, 2);
		System.out.println("Leaf count of tree is ->" + leafCount);

		System.out.print("PreOrder Traversal ->");
		printPreorder(root);
		System.out.println();
		System.out.print("PostOrder Traversal ->");
		printPostorder(root);
	}

}
