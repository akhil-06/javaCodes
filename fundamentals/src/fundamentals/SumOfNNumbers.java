package fundamentals;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int i = 1; // next number to be added
		int sum = 0;
		while(i <= n) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);
	}

}
