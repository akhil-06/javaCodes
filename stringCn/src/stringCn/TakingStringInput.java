package stringCn;

import java.util.Scanner;

public class TakingStringInput {
	
	public static void printchar(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
//		String str = s.nextLine();
//		System.out.println(str + " " + str.length());
//		
//		String str1 = new String();
//		str1="ab ce de fr fg";
//		System.out.println(str1);
		
		//count characters of string 
		String str3=s.nextLine();
		printchar(str3);
		
	}

}
