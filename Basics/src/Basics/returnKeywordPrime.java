package Basics;

import java.util.Scanner;

public class returnKeywordPrime {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		int div = 2;
		while(div <= n/2)
		{
			if(n % div == 0)
			{
				System.out.println("composite");
				return;
			}
			div = div + 1;
		}
		System.out.println("prime");
	}

}
