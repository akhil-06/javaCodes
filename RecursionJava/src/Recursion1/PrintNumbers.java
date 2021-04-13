package Recursion1;

import java.util.Scanner;

public class PrintNumbers{
	
	public static void printNumbers(int num) {
		if(num == 0)
			return;
		printNumbers(num-1);
		System.out.println(num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		printNumbers(num);
//		System.out.println(ans);
	}

}
