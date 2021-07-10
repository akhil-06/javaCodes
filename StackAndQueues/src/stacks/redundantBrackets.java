package stacks;

import java.util.Scanner;
import java.util.Stack;

public class redundantBrackets {
	
	private static boolean find(char ch) {
		if(ch == '+' || ch == '*' || ch == '/' || ch == '-') {
			return true;
		}
		return false;
	}

	public static boolean redundantBrackets(String str) {
		if(str.length() == 0) {
			return false;
		}
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i) == '(' || find(str.charAt(i))) {
				stack.push(str.charAt(i));
			}else if(str.charAt(i) == ')') {
				boolean hasOperator = false;
				
				while(stack.peek()!='(' && !stack.isEmpty()) {
					stack.pop();
					hasOperator = true;
				}
				if(!hasOperator) {
					return true;
				}
				
				if(!stack.isEmpty()) {
					stack.pop();
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean ans = redundantBrackets(str);
		System.out.println(ans);
	}

}
