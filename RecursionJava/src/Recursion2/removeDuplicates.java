package Recursion2;

import java.util.Scanner;

public class removeDuplicates {

	public static String removeDuplicates(String str) {
		if(str.length() <= 1) {
			return str;
		}

		if(str.charAt(0) == str.charAt(1)) {
			return removeDuplicates(str.substring(1));
		}else {
			String smallans = removeDuplicates(str.substring(1));
			return str.charAt(0) + smallans;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = removeDuplicates(str);
		System.out.println(ans);
	}

}
