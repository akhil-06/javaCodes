package fundamentals;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 2;
		while(i <= n/2) {
			if(n % i == 0) {
				System.out.println(i);
			}
			i = i + 1;
		}

	}

}
