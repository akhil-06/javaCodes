package Recursion3;

import java.util.Scanner;

public class returnAllCodes {
	
	public static char getChar(int n) {
		return (char)(n+96);
	}

	public static String[] returnAllCodes(String str) {
		if(str.length() == 0) {
			String ans[] = {" "};
			return ans;
		}

		//taking only 1st char
		int firstDigit = (str.charAt(0) - '0');
		String smallAns1[] = returnAllCodes(str.substring(1));
		
		//taking first 2 characters here
		String smallAns2[] = new String[0];
		int  first2digits = 0;
		if(str.length()>=2) {
			first2digits= ((str.charAt(0) - '0') * 10 + (str.charAt(1) - '0'));
			if( first2digits >= 10 &&  first2digits <= 26) {
				smallAns2 = returnAllCodes(str.substring(2));
			}
		}
		
		//now to merge the two answers here
		String ans[] = new String[smallAns1.length + smallAns2.length];
		int k=0;
		for(int i=0;i<smallAns1.length;i++) {
			char firstDigitChar = getChar(firstDigit);
			ans[k] = firstDigitChar + smallAns1[i];
			k++;
		}
		for(int i=0;i<smallAns2.length;i++) {
			char firstTwoDigitChar = getChar(first2digits);
			ans[k] = firstTwoDigitChar + smallAns2[i];
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String output[] = returnAllCodes(str);
		for(int i=0;i<output.length;i++) {
			System.out.println(output[i]);
		}
	}

}
