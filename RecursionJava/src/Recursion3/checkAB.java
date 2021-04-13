package Recursion3;

import java.util.Scanner;

public class checkAB {

	public static boolean checkAB(String str) {
		
		if(str.length() == 0) {
			return true;
		}
		if(str.charAt(0) != 'a') {
			return false;
		}

		if(str.substring(1).length()>1 && str.substring(1,3).equals("bb")) {
		return checkAB(str.substring(3));
		}else {
			return checkAB(str.substring(1));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean ans = checkAB(str);
		System.out.println(ans);
	}

}
