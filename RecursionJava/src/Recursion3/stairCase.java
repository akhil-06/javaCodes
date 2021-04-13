package Recursion3;

import java.util.Scanner;

public class stairCase {

	public static int stairCAse(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}else {
			return stairCAse(n-1) + stairCAse(n-2) + stairCAse(n-3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int ans  = stairCAse(a);
		System.out.println(ans);

	}

}
