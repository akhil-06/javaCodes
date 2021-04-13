package fundamentalsa;

import java.util.Scanner;

public class ReverseNumber {
	
	public static void ReverseNumber(int num) {
		int sum = 0;
		int re;
		while(num>0) {
			re=num%10;
			sum=(sum*10)+re;
			num=num/10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		ReverseNumber(num);
	}

}
