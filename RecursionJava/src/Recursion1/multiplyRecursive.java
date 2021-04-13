package Recursion1;

import java.util.Scanner;

public class multiplyRecursive {

	public static int multiply(int num,int num1) {
		if(num==0 || num1 == 0) {
			return 0;
		}
		return num + multiply(num, num1-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int num1 = s.nextInt();
		int ans = multiply(num,num1);
		System.out.println(ans);
	}

}
