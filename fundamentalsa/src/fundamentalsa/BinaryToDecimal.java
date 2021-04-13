package fundamentalsa;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void BinaryToDecimal(int num) {
		int i=0;
		double sum=0;
		while(num>0) {
			int r= num%10;
			double power = Math.pow(2,i)*r;
			 sum =sum +power;
			i++;
			num=num/10;
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		BinaryToDecimal(num);
	}

}
