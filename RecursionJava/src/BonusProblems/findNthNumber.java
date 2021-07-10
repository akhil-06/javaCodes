package BonusProblems;

import java.util.Scanner;

public class findNthNumber {

	
	public static long findNthNum(int calculated,int current,int num) {
		int i;
		long cur = 1;
		if(current == num+1) {
			return 0;
		}
		
		for(i=calculated; i<calculated + current;  i++) {
			cur *= i;
		}
//		ans += res;
		return cur + findNthNum(i,current+1,num);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		long ans = findNthNum(1,1,num);
		System.out.println(ans);
	}

}
