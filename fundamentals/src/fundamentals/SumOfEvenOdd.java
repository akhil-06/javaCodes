package fundamentals;

import java.util.Scanner;

public class SumOfEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		int evenSum = 0 , oddSum = 0;
		int sum = 0;
		while(n > 0) {
			int LastNumber = n % 10;
			if(LastNumber % 2 == 0) {
			 evenSum = evenSum + LastNumber;
			}else {
				oddSum = oddSum + LastNumber;
			}
			n = n / 10;
		}
		System.out.println(evenSum + " " + oddSum);
	}

}
