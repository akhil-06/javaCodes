package Recursion3;

import java.util.Scanner;

public class printSubsequences {
	
	public static void printSubsequences(String str, String outputsoFar) {
		if(str.length()  == 0) {
			System.out.println(outputsoFar);
//			????
			return;
		}
		
		//when 1st char is not included
		printSubsequences(str.substring(1), outputsoFar);
		
		//when 1st char is included
		printSubsequences(str.substring(1),outputsoFar + str.charAt(0));
		
	}
	
	public static void printSubsequences(String str) {
		printSubsequences(str,"");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printSubsequences(str);
	}

}
