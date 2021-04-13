package fundamentalsa;

import java.util.Scanner;

public class SquareRoot {

	public static void SquareRoot(int num) {
		int result = 1;
		int i = 1;
		while(result<=num) {
			i++;
			result= i*i;
		}
		System.out.println(i-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		SquareRoot(num);
	}

}
