package Recursion1;

import java.util.Scanner;

public class fibbonaciSeries {

	public static int fibonaccoSeries(int num) {
		 if (num <= 1)
		       return num;
		    return fibonaccoSeries(num-1) + fibonaccoSeries(num-2);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int ans = fibonaccoSeries(num);
		System.out.println(ans);
	}

}
