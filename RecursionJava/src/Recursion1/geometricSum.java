package Recursion1;

import java.util.Scanner;

public class geometricSum {
	
	public static double geometricSum(double num) {
		if(num == 0) {
			return 1;
		}
//		int a = a*2; 
		return geometricSum(num-1) + 1/Math.pow(2, num);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		double sum = geometricSum(num);
		System.out.println(sum);
	}

}
