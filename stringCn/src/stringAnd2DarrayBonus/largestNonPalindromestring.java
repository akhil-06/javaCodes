package stringAnd2DarrayBonus;

import java.util.Scanner;

public class largestNonPalindromestring {

	public static boolean ispalindrome(String str) {
		int start = 0;
		int end = str.length()-1;
		while(start <= end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

	public static void largestNonPalindromeString(String str) {
		int firstCh = str.charAt(0);
		int i=1;
		for(i=1;i<str.length();i++) {
			if(str.charAt(i) != firstCh) {
				break;
			}
		}
		if(i == str.length()) {
			System.out.println("0");
		}
		
		if((ispalindrome(str))){
			System.out.println(str.length()-1);
		}else {
			System.out.println(str.length());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		largestNonPalindromeString(str);
	}

}
