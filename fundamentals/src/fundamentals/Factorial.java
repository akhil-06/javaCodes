package fundamentals;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int factorial = 1;
		for(int i = n; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
