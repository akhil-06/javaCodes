package patterns;

import java.util.Scanner;

public class pattern18 {

	public static void main(String[] args) {
		int n;
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
			while(j <= i) {
				System.out.print(j);
				j = j + 1;
			
			}
			System.out.println();
			i = i + 1;
		}

	}
}


