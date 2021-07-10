package Recursion3;

import java.util.Scanner;

public class printPermutations {
	
	public static void printAllPermutationshelper(String str,String outputsoFar) {
		if(str.length()  == 0) {
			System.out.println(outputsoFar);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			String ans = str.substring(0,i) + str.substring(i+1);
			
			printAllPermutationshelper(ans,outputsoFar + ch);
		}
	}

	public static void printPermutations(String str) {
		printAllPermutationshelper(str,"");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printPermutations(str);
	}

}
