package patterns;

import java.util.Scanner;

public class pattern13 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j = 1;
			while(j <= i) {
				char ithchar = (char)('A' + i - 1);
				System.out.print(ithchar);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
