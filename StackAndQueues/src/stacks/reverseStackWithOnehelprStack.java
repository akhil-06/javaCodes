package stacks;

import java.util.Stack;

public class reverseStackWithOnehelprStack {
	
	public static void reverseStack(Stack<Integer> stack, Stack<Integer> stackHelper) {
		if(stack.isEmpty() || stack.size() == 1) {
			return;
		}
		int temp = stack.pop();
		reverseStack(stack, stackHelper);

		while(!stack.isEmpty()){
			int top = stack.pop();
			stackHelper.push(top);
		}
		
		stack.push(temp);
		while(!stackHelper.isEmpty()) {
			int top = stackHelper.pop();
			stack.push(top);
		}
//		System.out.println("Top of stack =" +  stack.peek());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//make the array input dynamic
		int arr[] = {1, 2, 3, 4, 5 ,10};
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> stackHelper = new Stack<Integer>();
		
		for(int elem : arr) {
			stack.push(elem);
		}
//		System.out.println("Top of stack =" +  stack.peek());
		reverseStack(stack,stackHelper);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
