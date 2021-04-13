package Recursion2;

import java.util.Scanner;

public class replacePI {
	
	public static String removePi(String str) {
		// base condition
        // if the string is empty
        // or of length one
        if (str.length() <= 1) {
            return str;
        }
 
        // if the first character is 'p'
        // and the first character of the part
        // passed to recursion is 'i' then replace
        //"pi" with "3.14"
        if (str.charAt(0) == 'p' && str.length() >= 2 && str.charAt(1) == 'i') {
            return "3.14" + removePi(str.substring(2, str.length()));
        }
 
        // if the first character is not 'p'
        // then just put that character in
        // front of the answer which came
        // from recursion
        return str.charAt(0) + removePi(str.substring(1, str.length()));

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = removePi(str);
		System.out.println(ans);
	}

}
