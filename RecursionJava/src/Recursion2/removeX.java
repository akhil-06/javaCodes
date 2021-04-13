package Recursion2;

import java.util.Scanner;

public class removeX {
	
	public static String removeX(String str) {
		if(str.length() == 0) {
			return "";
		}
		String ans = "";
		//we are taking only small x
		if(str.charAt(0) != 'x') {
			ans = ans + str.charAt(0);
		}
		String sa = removeX(str.substring(1));
		return ans+sa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String removedX = removeX(str);
		System.out.println(removedX);
	}

}
