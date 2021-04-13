package stringCn;

import java.util.Scanner;

public class RemoveConsicutiveDuplicates {

	public static String removeDuplicates(String str) {
		int n = str.length();
		if(n==0) {
			return str;
		}
		String answer="";
		int startIndex=0;
		while(startIndex<n) {
			char uniqueChar = str.charAt(startIndex);
			int nextuniqueIndex = startIndex + 1;
			while(nextuniqueIndex<n && str.charAt(nextuniqueIndex)==uniqueChar) {
				nextuniqueIndex += 1;
			}
			answer += uniqueChar;
			startIndex = nextuniqueIndex;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = removeDuplicates(str);
		System.out.println(str1);

	}

}
