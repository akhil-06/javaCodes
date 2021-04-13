package stringCn;

import java.util.Scanner;

public class StrinfFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcd";
		String str2 = "abcde";
		System.out.println(str.charAt(2));
		System.out.println(str.equals(str2));
		System.out.println(str.substring(1,2));
		System.out.println(str.contains(str2));
		System.out.println(str.concat(str2));
		System.out.println(str.compareTo(str2));
		System.out.println(str.isBlank());
		System.out.println(str2.length());
		System.out.println(str2.lastIndexOf(3));
	}

}
