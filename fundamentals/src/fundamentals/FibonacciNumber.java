package fundamentals;

import java.util.Scanner;

public class FibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int a = 0, b = 1;

		System.out.print(a + " ");
		System.out.print(b + " ");

		for(int i = 0; i<n-2; i++) {
//			System.out.print(a + " + ");

			int sum = a + b;
			System.out.print(a + " + ");
			a = b;
			b = sum;
		}
	}

}
