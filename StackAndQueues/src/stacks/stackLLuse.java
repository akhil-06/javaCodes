package stacks;

public class stackLLuse {

	public static void main(String[] args) throws stackEmptyException {
		// TODO Auto-generated method stub
		stackUsingLL<Integer> stack = new stackUsingLL<Integer>();
		stack.push(10);
		stack.push(20);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.size());
	}

}
