package Recursion2;

import java.util.Scanner;

public class stringToInteger {

	public static double stringToInteger(String str) { 
		if(str.length() == 1) {
			return str.charAt(0) - 48;
		}
		
		double a = stringToInteger(str.substring(1));
		int b1 = str.charAt(0);
		b1 = b1-48;
		System.out.println("b1 is = " + b1);
		int stringlen = str.length()-1;
		System.out.println("stringlen is = " + stringlen);
		double len = b1 * Math.pow(10, stringlen) + a;
		System.out.println("len is = " + len);
		return len;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		double ans = stringToInteger(str);
		System.out.println(ans);
	}

}
