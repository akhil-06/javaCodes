package fundamentals;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int b = s.nextInt();
		
		int result = 1;
		for(int i =0; i<b; i++) {
			result = result * n;
		}
		System.out.println(result);
	}

}
