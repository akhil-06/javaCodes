package stacks;

import java.util.Stack;

public class stockSpan {
	
	public static int[] stockSpan(int input[]) {
		Stack <Integer> stack = new Stack<Integer>();
		int output[] = new int[input.length];
		stack.push(0);
		output[0] = 1;
		for(int i=1; i<input.length;i++) {
			while(!stack.isEmpty() && input[stack.peek()] < input[i]) {
				stack.pop();
			}
			
			if(stack.isEmpty()) {
				output[i] = i+1;
			}else {
				output[i] = i-stack.peek();
			}
			stack.push(i);
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {60, 70, 80 ,100, 90 ,75 ,80, 120};
		int output[] = stockSpan(input);
		for(int i=0;i<output.length;i++) {
			System.out.print(output[i] + " ");
		}
	}

}
