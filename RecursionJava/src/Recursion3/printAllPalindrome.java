package Recursion3;

import java.util.Scanner;

//1. You are given a string of length n.
//2. You have to partition the given string in such a way that every partition is a palindrome.
public class printAllPalindrome {
	
	public static boolean isPalindrome(String str) {
		int li=0;
		int ri = str.length() -1;
		while(li < ri) {
			char left = str.charAt(li);
			char right  = str.charAt(ri);
			if(left != right) {
				return false;
			}
			li++;
			ri--;
		}
		return true;
	}
	
	public static void printAllPalindromes(String str, String outputsoFar) {
		if(str.length()  == 0) {
			System.out.println(outputsoFar);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			String prefix = str.substring(0,i+1);
			String restString = str.substring(i+1);
			if(isPalindrome(prefix)) {
				printAllPalindromes(restString, outputsoFar + "(" + prefix + ")");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printAllPalindromes(str,"");
	}

}
