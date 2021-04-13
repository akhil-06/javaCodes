package stringCn;

import java.util.Scanner;

public class WholeReverseWord {

	public static String ReverseString(String str) {
		String Reversedans = "";
		for(int i=0;i<str.length();i++) {
			Reversedans = str.charAt(i) + Reversedans;
		}
		return Reversedans;
	}

	public static String ReverseWordWise(String str) {
		int end = str.length();
		int i = str.length()-1;
		String output = "";
		while(i>=0) {
			if(str.charAt(i) == ' ') {
				output = output + str.substring(i+1,end) + " ";
				end=i;
			}
			i--;
		}
		output = output + str.substring(i+1,end); 
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String Str1 = ReverseString(str);
		String Str2 = ReverseWordWise(Str1);
		System.out.println(Str2);
	}

}
