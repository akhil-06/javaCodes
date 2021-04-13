package fundamentalsa;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int temp;
		int sum=0;
		int re;
		temp=num;
		while(num>0) {
			re = num%10;
			sum = (sum*10)+re;
			num=num/10;
		}
		
		if(temp==sum) {
			System.out.println("palindrom");
		}else {
			System.out.println("not palindrom");
		}
		}
}
