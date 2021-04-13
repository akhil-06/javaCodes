  package patterns;

import java.util.Scanner;

public class pattern20 {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 1;
		while(i <= n) {
			int j =1;
			while(j <= n - i + 1) {
				System.out.print(n - i + 1);
				j = j + 1;
			}
			System.out.println();
			i = i + 1;
		}

	}

}
