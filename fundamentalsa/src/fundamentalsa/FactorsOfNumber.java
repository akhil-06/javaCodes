package fundamentalsa;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = 9;
		int i=2;
		while(i<=n/2) {
			if(n%i==0) {
				int r = i;
				System.out.println(i);
			}
			i++;
		}
	}

}
