package fundamentalsa;

import java.util.Scanner;

public class TakingInputInJava {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
		
		//for char
		
		String str = s.next();
		char ch  = str.charAt(0);
		System.out.println(str);
		System.out.println(ch);
	}

}
