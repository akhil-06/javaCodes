package Functions;

import java.util.Scanner;

public class isPrime {
	
	public static boolean checkPrime(int n) {
		
		int div = 2;
		while(div <= n/2)
		{
			if(n % div == 0) {
				// not prime 
				return false;
			}
			div = div +1;
		}
		return true;
		
	}
	
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		boolean isPrime = checkPrime(n);
		System.out.println(isPrime);
	}
}
