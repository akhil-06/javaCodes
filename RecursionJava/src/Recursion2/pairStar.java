package Recursion2;

import java.util.Scanner;

public class pairStar {

	public static String pairStar(String str) {
		if(str.length() <= 1) {
			return str;
		}
		
		String smallans = pairStar(str.substring(1));
//		String ans="";
		if(str.charAt(0) == smallans.charAt(0)) {
			String ans = str.charAt(0) + "*" + smallans;
			return ans;
		}else {
			String ans = str.charAt(0) + smallans;
			return ans;
		}


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = pairStar(str);
		System.out.println(ans);
	}

}
