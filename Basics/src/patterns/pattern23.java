package patterns;

import java.util.Scanner;

public class pattern23 {

	public static void main(String[] args) {
		int n;
		int p = 1;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int i = 1;
		while(i <= n) {
			int spaces = 1;
			while(spaces <= n - i) {
				System.out.print(' ');
				spaces = spaces + 1;
			}
		
			int j = 1;
			p = i;
			while(j <= i) {
				System.out.print(p);
				p = p + 1;
				j = j + 1;
			
			}
			
			int dec = i - 1;
			int k = 2 * i - 2;
			while(dec >= 1) {
				System.out.print(k);
				k = k - 1;
				dec = dec - 1;
			}
			System.out.println();
			i = i + 1;
		}

	}
}


