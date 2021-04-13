package fundamentals;

import java.util.Scanner;

public class CheckPrimeOrNot {

	public static void main(String[] args) {

		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int divisor = 2;
		//boolean isPrime = true;
		while(divisor <= n/2) {
			if(n % divisor == 0) {
				//System.out.println("Composite");
				//isPrime = false;
				return;
			}

			divisor = divisor + 1;
		}
		
		System.out.println("Prime");
		
//		if(isPrime == true) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Composite");
//		}

	}
}
