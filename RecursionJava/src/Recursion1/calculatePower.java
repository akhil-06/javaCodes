package Recursion1;

import java.util.Scanner;

public class calculatePower {
	
	public static int power(int x, int y) {
		if(x==0 || y==0) {
			return 1;
		}
		int sa = power(x,y-1);
		return x*sa;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int p = power(n,m);
		System.out.println(p);
	}

}
