package Recursion1;

import java.util.Scanner;

public class sumOfDigits {

	public static int sumofDigits(int n) {
		if(n <= 9)
			return n;
		int ans = sumofDigits(n/10);
		return n%10 + ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = sumofDigits(num);
		System.out.println(sum);
	}

}
