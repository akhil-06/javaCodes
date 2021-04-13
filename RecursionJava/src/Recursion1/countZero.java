package Recursion1;

import java.util.Scanner;

public class countZero {

	public static int countZero(int num) {
		if(num == 0) {
			return 0;
		}
		if(num%10 == 0) {
			return 1+countZero(num/10);
		}else {
			return countZero(num/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans= countZero(num);
		System.out.println(ans);
	}

}
