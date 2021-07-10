package BonusProblems;

import java.util.Scanner;

public class finfInN {

	public static double logFactN(int num) {
		if(num == 1) {
			return 0;
		}
		double ans = logFactN(num-1);
		return Math.log(num) + ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		double ans = logFactN(num);
		System.out.println(ans);
	}

}
