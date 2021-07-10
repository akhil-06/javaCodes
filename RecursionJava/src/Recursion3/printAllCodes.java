package Recursion3;

import java.util.Scanner;

public class printAllCodes {

	public static char getChar(int n) {
		return (char)(n+96);
	}

	public static void printAllCodeshelper(String str, String outputsoFar) {
		if(str.length()  == 0) {
			System.out.println(outputsoFar);
			return;
		}
		int firstDigit = (str.charAt(0) - '0');
//		int first2digits= ((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0'));
		char firstDigitChar = getChar(firstDigit);

		printAllCodeshelper(str.substring(1),outputsoFar + firstDigitChar);
		
		
		if(str.length()>=2) {
			int first2digits= ((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0'));
			if( first2digits >= 10 &&  first2digits <= 26) {
				printAllCodeshelper(str.substring(2), outputsoFar + getChar(first2digits));
			}
		}
	}

	public static void printAllCodes(String str) {
		printAllCodeshelper(str,"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printAllCodes(str);
	}

}
