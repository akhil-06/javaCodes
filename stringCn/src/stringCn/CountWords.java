package stringCn;

import java.util.Scanner;

public class CountWords {

	public static int CountW(String str) {
		int max=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ' || str.charAt(i) == '\n' ) {
				max += 1;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int c= CountW(str);
		System.out.println(c+1);
	}

}
