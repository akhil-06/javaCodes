package fundamentals;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		a = s.nextInt();
		//int rem = a % 2;
		//boolean result = rem == 0;
		if(a%2 == 0) {
			System.out.println(a + " is even");
		}else {
			System.out.println(a + " is odd");
		}
		// can use two if
	}

}
