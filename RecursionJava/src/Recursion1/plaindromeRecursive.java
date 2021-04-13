package Recursion1;

import java.util.Scanner;

public class plaindromeRecursive {
	
	public static boolean palindrome(String str) {
		if(str.length() <= 1) {
			return true;
		}
		
		if(str.charAt(0) == str.charAt(str.length()-1)) {
			
			return palindrome(str.substring(1,str.length()-1));
		}else {
//			System.out.println("false");
			return false;
		}
	}

//	public static void palindrome(String str) {
//		int si = str.charAt(0);
//		palindrome(str,si);
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(palindrome(str)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

	}

}
