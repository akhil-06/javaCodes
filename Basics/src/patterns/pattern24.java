package patterns;

import java.util.Scanner;

public class pattern24 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int firstHalf = (n + 1) / 2;
		int secondHalf = n / 2;

		//first half
		int i = 1;
		while (i <= firstHalf) {
			int spaces = 1;
			while (spaces <= firstHalf - i) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int j = 1;
			while (j <= 2 * i - 1) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println( );
			i = i + 1;
		}

		// second half
		i = secondHalf;
		while(i >= 1) {
			int spaces = 1;
			while(spaces <= secondHalf - i + 1) {
				System.out.print(" ");
				spaces = spaces + 1;
			}
			int j = 1;
			while(j <= 2 * i - 1) {
				System.out.print("*");
				j = j + 1;
			}
			System.out.println();
			i = i - 1;
		}

	}
}
