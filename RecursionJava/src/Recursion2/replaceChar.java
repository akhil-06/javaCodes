package Recursion2;

import java.util.Scanner;

public class replaceChar {

	public static String replaceChar(String str,char c , char c1) {
		if(str.length() == 0) {
			return "";
		}
		char ch;
		if(str.charAt(0) == c) {
			ch = c1;
		}else {
			ch = str.charAt(0);
		}
		String smallans = replaceChar(str.substring(1),c,c1);
		return (ch + smallans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print("Input character to replace: ");  
		// reading a character   
		char c = s.next().charAt(0);
		System.out.print("Input character by which it replace: ");
		char c1 = s.next().charAt(0);

		String ans = replaceChar(str,c,c1);
		System.out.println(ans);
	}

}
