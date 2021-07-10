 package stacks;

import java.util.Scanner;
import java.util.Stack;

public class balancedParanthesis {

	/* TC = O(n)
	 * SC = (n)
	 * N is length of expression */
	public static boolean balancedParantehsis(String str) {
		if(str.length() == 0) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i) == '(') || (str.charAt(i) == '{') || (str.charAt(i) == '[')) {
				stack.push(str.charAt(i));
			}
			else if((str.charAt(i) == ')') || (str.charAt(i) == '}') || (str.charAt(i) == ']')) {
				if(stack.isEmpty()) {
					return false;
				}
				if((str.charAt(i) == ')' && stack.peek() == '(') || (str.charAt(i) == '}' && stack.peek() == '{') || (str.charAt(i) == ']' && stack.peek() == '[')) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean ans = balancedParantehsis(str);
		System.out.println(ans);
	}

}
