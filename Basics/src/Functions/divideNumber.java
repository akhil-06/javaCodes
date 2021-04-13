package Functions;

import java.util.Scanner;

public class divideNumber {

	public static int divideNum(int a , int b) {

		if(b == 0) {
			return Integer.MIN_VALUE;
		}
		int	divide = a / b;
		return divide;
	}


	public static void main(String[] args) {


		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();

		int divide = divideNum( a , b);

		System.out.println(divide);


	}


}

