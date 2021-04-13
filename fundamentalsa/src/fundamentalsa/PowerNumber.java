package fundamentalsa;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int base = s.nextInt();
		int exponent = s.nextInt();
		int result=1;
		while(exponent!=0) {
			result=result*base;
			exponent--;
		}

		System.out.println(result);
	}

}
