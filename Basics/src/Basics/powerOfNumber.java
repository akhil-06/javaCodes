package Basics;

import java.util.Scanner;

public class powerOfNumber {

	public static void main(String[] args) {
		int num, power;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		power = s.nextInt();
		int ans = 1;
		while(power > 0) {
			ans *= num;
			power--;
		}
		System.out.println(ans);
	}

}
