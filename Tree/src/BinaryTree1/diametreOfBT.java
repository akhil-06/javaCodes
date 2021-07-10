package BinaryTree1;

import java.util.Scanner;

public class diametreOfBT {

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

	public static int diameterBt(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int op1 = height(root.left) + height(root.right);
		int op2 = diameterBt(root.left);
		int op3 = diameterBt(root.right);

		return Math.max(op1,Math.max(op2, op3));
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);
	}

	public static Pair<Integer, Integer> diametreHeight(BinaryTreeNode<Integer> root){
		if(root == null) {
			Pair<Integer, Integer> out = new Pair<>();
			out.first= 0;
			out.second = 0;
			return out;
		}
		Pair<Integer, Integer> lo = diametreHeight(root.left);
		Pair<Integer, Integer> ro = diametreHeight(root.right);
		int height = 1 + Math.max(lo.first, ro.first);

		int op1 = lo.first + ro.first;
		int op2 = lo.second;
		int op3 = ro.second;

		int diametre = Math.max(op1, Math.max(op2, op3));

		Pair<Integer, Integer> out = new Pair<>();
		out.first = height;
		out.second = diametre;
		return out;

	}

	public static BinaryTreeNode<Integer> TreeFormInPre(int []in, int []pre, int inS, int inE, int preS, int preE){
		if(inS > inE) {
			return null;
		}
		//rootdata lelia
		int rootData = pre[preS];
		//created root of tree by rootdata
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int inIndex = -1;
		//traverse the in array for calculating the all values
		for(int i= inS; i<=inE;i++) {
			if(in[i] == rootData) {
				inIndex = i;
				break;
			}
		}

		//this situation will not come, but we write to on safe side
		if(inIndex  == -1) {
			return null;
		}

		int inLeftS = inS;
		int inLeftE = inIndex - 1;
		int inRightS = inIndex + 1;
		int inRightE = inE;
		int preLeftS = preS + 1;
		//we done because the length of both will same
		//preLeftE - preLeftS = inLeftE - inLeftS -> both will have same elements 
		//by this equation we can write this
		int preLeftE = inLeftE - inLeftS + preLeftS;
		int preRightS = preLeftE + 1;
		int preRightE = preE;

		root.left = TreeFormInPre(in, pre, inLeftS, inLeftE, preLeftS, preLeftE);
		root.right = TreeFormInPre(in, pre, inRightS, inRightE, preRightS, preRightE);

		return root;
	}

	public static BinaryTreeNode<Integer> treeFrpmInPre(int in[], int pre[]){
		return TreeFormInPre(in, pre , 0, in.length -1, 0, pre.length -1);
	}

	public static BinaryTreeNode<Integer> treeFrpmInPost(int in[], int post[]){
		return TreeFormInPost(in, post , 0, in.length -1, 0, post.length -1);
	}


	public static BinaryTreeNode<Integer> TreeFormInPost(int []in, int []post,int sIn,int eIn,int sPs,int ePs){
		if(sIn>eIn){
			return null;
		}
		int rootData = post[ePs];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootIndex = -1;
		for(int i= sIn; i<=eIn;i++) {
			if(post[i] == rootData) {
				rootIndex = i;
				break;
			}
		}

		if(rootIndex  == -1) {
			return null;
		}

		int LstartIn=sIn;
		int LendIn=rootIndex-1;
		int RstartIn=rootIndex+1;
		int RendIn=eIn;
		int length=LendIn-LstartIn+1;
		int LendPs=sPs+(length)-1;
		int LstartPs=sPs;
		int RstartPs=LendPs+1;
		int RendPs=ePs-1;


		root.left = TreeFormInPre(in, post, LstartIn,LendIn,LstartPs,LendPs);
		root.right = TreeFormInPre(in, post, RstartIn,RendIn,RstartPs,RendPs);
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

	public static void preOrder(BinaryTreeNode<Integer> root)
	{
		if (root == null)
			return;
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}

		//we mirrored the left and right subtree
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);

		//now we have to swap left right thats why we do this
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
	}


	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printBT(root);
		////	int diametre = diameterBt(root);
		//		int diametre = diametreHeight(root).first;
		//		System.out.println(diametre);
		//		System.out.println(diametreHeight(root).second);
		//		

		//this one is for create for inorder and preorder
		//we have two arrays in which in and pre is stored
		//		int []in = {4,2,5,1,3,7};
		//		int []pre = {1,2,4,5,3,7};
		//		BinaryTreeNode<Integer> root2 = treeFrpmInPre(in, pre);
		//		printBT(root2);


		//this one is for create for inorder and postorder
		//we have two arrays in which in and pre is stored
		//		int []in = {4, 8, 2, 5, 1, 6, 3, 7};
		//		int []post = {8, 4, 5, 2, 6, 7, 3, 1};
		//		BinaryTreeNode<Integer> root3 = treeFrpmInPost(in, post);
		//		preOrder(root3);
		System.out.println();
		mirrorBinaryTree(root);
		printBT(root);

	}

}


