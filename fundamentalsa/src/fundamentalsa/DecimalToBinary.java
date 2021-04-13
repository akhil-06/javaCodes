 package fundamentalsa;

import java.util.Scanner;

public class DecimalToBinary {

		public static void DecimalToBinary(int num) {
			int ans=0;
			int pow = 1;
//			int rem;
			while(num>0) {
				int rem = num%2;
				ans = ans+rem*pow;
				pow=pow*10;
				num=num/2;
			}
			System.out.println(ans);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		DecimalToBinary(num);
	}

}
