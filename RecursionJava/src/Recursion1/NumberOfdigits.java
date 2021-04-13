package Recursion1;

import java.util.Scanner;

public class NumberOfdigits {
	
	public static int NoD(int num) {
		if(num == 0) {
			return 0;
		}
		int sa = NoD(num/10);
		return 1+sa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = NoD(n);
		System.out.println(ans);
	}

}
