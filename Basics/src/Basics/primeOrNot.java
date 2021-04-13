package Basics;

import java.util.Scanner;

public class primeOrNot {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int div = 2;
		boolean isPrime = true;
		while(div <= n/2)
		{
			if(n % div == 0) {
				//System.out.println(div +" "+ "not prime ");
				isPrime = false;
			}
			div = div +1;
		}
		if(isPrime)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}

	}

}


