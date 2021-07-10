package BinaryTree1;

public class BSTclassUse {

	public static void main(String[] args) {
		BSTclas b = new BSTclas();
		b.insert(5);
		b.insert(2);
		b.insert(7);
		b.insert(1);
		b.insert(3);
		b.insert(6);
		b.insert(8);
		
		b.printTree();
		
		b.delete(5);
		
		System.out.println();
		b.printTree();
		
		System.out.println(b.isPresent(3));
		System.out.println(b.isPresent(5));
		
		System.out.println(b.size());
	}

}
