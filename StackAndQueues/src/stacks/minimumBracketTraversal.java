package stacks;

import java.util.Scanner;
import java.util.Stack;

public class minimumBracketTraversal {
	
	//TC- O(n)  SC - O(n)    n is the no. of brackets
	public static int minimumBracketsTraversal(String input) {
		int len = input.length();
		if(len == 0) {
			return 0;
		}
		if(len%2 != 0) {
			return -1;
		}
		
		Stack <Character> stack = new Stack<Character>();
		int count =0;
		for(int i=0;i<input.length();i++) {
			if(input.charAt(i) == '{') {
				stack.push(input.charAt(i));
			}else {
				//pop the balanced pair
				if(!stack.isEmpty() && stack.peek() == '{') {
					stack.pop();
				}else {
					stack.push(input.charAt(i));
				}
			}
		}
		//now only unbalanced are remaining in stack
		while(!stack.isEmpty()) {
			char c1 = stack.pop();
			char c2 = stack.pop();
			
			//when char1 is } and char2 is { then we have to reverse both of them then so count is increased by 2
			//otherwise we have to reverse only 1 so count increase by 1
			if(c1 == c2) {
				count++;
			}else {
				count = count + 2;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int ans = minimumBracketsTraversal(str);
		System.out.println(ans);
	}

}
