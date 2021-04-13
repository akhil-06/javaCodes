package stringCn;

import java.util.Scanner;

public class RemoveChar {
	public static String removeChar(String str,char ch) {
		int n = str.length();
		if(n==0) {
			return str;
		}
		String anas = "";
		for(int i=0;i<n;i++) {
			if(str.charAt(i) != ch) {
			 anas = anas + str.charAt(i);
			}
		}
		return anas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = s.next().charAt(0);
		String str1 = removeChar(str,ch);
		System.out.println(str1);
	}

}
