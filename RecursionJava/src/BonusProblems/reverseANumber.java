package BonusProblems;

import java.util.Scanner;

public class reverseANumber {

	public static void reverseNum(int num) {
		if(num <= 9) {
			System.out.println(num);
			return;
		}
		System.out.print(num%10);
		reverseNum(num/10);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		reverseNum(num);
	}

}
