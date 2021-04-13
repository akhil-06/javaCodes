package fundamentalsa;

import java.util.Scanner;

public class AllPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		for(int i=2;i<=num;i++) {
			boolean isP = true;
			for(int j = 2;j<i;j++) {
				if(i%j==0) {
					isP=false;
					break;
					
				}
			}
			if(isP){
				System.out.println(i);
			}
		}
	}

}
