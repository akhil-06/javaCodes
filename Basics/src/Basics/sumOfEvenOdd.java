package Basics;

import java.util.Scanner;

public class sumOfEvenOdd {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int evensum = 0;
		int oddsum = 0;
		while(n > 0) {
			int last = n % 10;
			if(last % 2 == 0) {
				evensum += last;
			}
			else {
				oddsum += last;
			}
			n = n/10;
		}
		System.out.println(evensum+ "   "+oddsum);
	}

}
