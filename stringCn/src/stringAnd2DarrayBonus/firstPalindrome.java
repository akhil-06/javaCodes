package stringAnd2DarrayBonus;

import java.util.Arrays;
import java.util.Scanner;

public class firstPalindrome {

	public static void firstPalindrome(String str) {

		//this is the freq array and count the freq of chars
		int freq[] = new int[26];
		for(int i=0;i<str.length();i++) {
			int count = str.charAt(i) - 'a';
			freq[count]++;
		}

		//here i am calculating the no of odd char
		int countOdd = 0;
		for(int i=0;i<26;i++) {
			if(freq[i] % 2 != 0) {
				countOdd++;
			}
		}

		//if length is even and still we have odd then print " "
		if(str.length() % 2 == 0 && countOdd != 0) {
			System.out.print(" ");
		}
		//if length is odd and still we have not odd char then print " "
		if(str.length() != 0 && countOdd != 1) {
			System.out.print(" ");
		}

		char temp[] = str.toCharArray();
		Arrays.sort(temp);
		String newStr = "";
		for(char i : temp) {
			newStr += i; 
		}

		String output1 = "", output2 = "", output = "";

		for(int i=0;i<newStr.length();) {
			int index = newStr.charAt(i) - 'a';
			int count = freq[index];
			if(count%2 == 0) {
				output1 += newStr.substring(i,i+(count/2));
				output2 = newStr.substring(i,i+(count/2)) + output2;
			}else {
				output = newStr.substring(i,i+count);
			}
			i+=count;
		}
		String ans = output1 + output + output2;
		System.out.print(ans);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		firstPalindrome(str);
	}

}
