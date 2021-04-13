package Basics;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		if(n % 2 == 0) {
			System.out.println("number is even");
		}else {
			System.out.println("number is odd");
		}

	}

}
