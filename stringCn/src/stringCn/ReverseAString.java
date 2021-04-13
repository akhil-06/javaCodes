package stringCn;

import java.util.Scanner;

public class ReverseAString {
	
	public static String ReverseaString(String str) {
		String ReversedString = "";
//		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			ReversedString=str.charAt(i)+ReversedString;
//			another method to solve this problem
//		for(int i=str.length()-1;i>=0;i--) {
//			ReversedString+=str.charAt(i);
		}
		return ReversedString;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String Str1 = ReverseaString(str);
		System.out.println(Str1);
		if(str.equals(Str1)) {
			System.out.println("palindrom");
		}else {
			System.out.println("no palindrom");
		}
	}

}
