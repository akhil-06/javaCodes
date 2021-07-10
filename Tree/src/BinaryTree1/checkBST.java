package BinaryTree1;

import java.util.Scanner;

public class checkBST {
	
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
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftHeight = largest(root.left);
		int rightHeight = largest(root.right);
		
		return Math.max(root.data, Math.max(leftHeight, rightHeight));
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftHeight = minimum(root.left);
		int rightHeight = minimum(root.right);
		
		return Math.min(root.data, Math.min(leftHeight, rightHeight));
	}
	public static boolean checkBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		
		int rightmin = minimum(root.right);
		if(root.data > rightmin) {
			return false;
		}
		
		int leftmax = largest(root.left);
		if(leftmax >= root.data) {
			return false;
		}
		
		boolean isLeft = checkBST(root.left);
		boolean isRight = checkBST(root.right);
		
		return isLeft && isRight;
	}
	
	
	public static checkBSTclass checkBSTbetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			checkBSTclass ans = new checkBSTclass(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
			return ans;
		}
		
		checkBSTclass left = checkBSTbetter(root.left);
		checkBSTclass right = checkBSTbetter(root.right);
		
		int min = Math.min(root.data, Math.min(left.min, right.min));
		int max = Math.max(root.data, Math.max(left.max, right.max));
		boolean isBST = true;
		
		if(left.max >= root.data) {
			isBST = false;
		}
		
		if(right.min < root.data) {
			isBST = false;
		}
		
		if(!left.isBST) {
			isBST = false;
		}
		
		if(!right.isBST) {
			isBST = false;
		}
		
		checkBSTclass ans = new checkBSTclass(min, max, isBST);
		return ans;
		
	}
	
	public static boolean serachBST(BinaryTreeNode<Integer> root, int x){
		if(root == null) {
			return false;
		}
		
		if(root.data == x) {
			return true;
		}
		
		if(root.data < x) {
			return serachBST(root.right, x);
		}
		return serachBST(root.left, x);
	}
	
	public static void elementsRangeFromK1toK2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if(root == null) {
			return;
		}
		if(root.data < k1) {
			elementsRangeFromK1toK2(root.right, k1, k2);
		}else if(root.data > k2) {
			elementsRangeFromK1toK2(root.left, k1, k2);
		}else {
			System.out.println(root.data);
			elementsRangeFromK1toK2(root.left, k1, k2);
			elementsRangeFromK1toK2(root.right, k1, k2);
		}
		
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBSTHelper(int []arr, int start, int end){
		int mid = (start+end)/2;
		
		if(start > end) {
			return null;
		}
		
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[mid]);
		root.left = sortedArrayToBSTHelper(arr, start, mid-1);
		root.right = sortedArrayToBSTHelper(arr, mid+1, end);
		
		return root;
	}
	
	public static BinaryTreeNode<Integer> sortedArrayToBST(int []arr){
		return sortedArrayToBSTHelper(arr, 0 ,arr.length-1);
		
	}
	
	private static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		boolean ans = checkBST(root);
//		System.out.println(ans);
		
		
		//this is for search root in BST
		Scanner s = new Scanner(System.in);
//		int x = s.nextInt();
//		System.out.println(serachBST(root, x));
//		
		//this is for path b/w k1 to k2
//		int k1 = s.nextInt();
//		int k2 = s.nextInt();
//		elementsRangeFromK1toK2(root, k1, k2);
		
		//sorted array to BST
		int []arr = {1,2,3,4,5,6,7};
		BinaryTreeNode<Integer> root2 = sortedArrayToBST(arr);
		preOrder(root2);

		//this is for the better of checkBST
//		System.out.println(checkBSTbetter(root).isBST);
//		System.out.println(checkBSTbetter(root).min);
//		System.out.println(checkBSTbetter(root).max);

	}

}
