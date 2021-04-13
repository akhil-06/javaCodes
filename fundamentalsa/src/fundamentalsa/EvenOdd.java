package fundamentalsa;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		if(a>b) {
			System.out.println("a is greater");
		}else {
			System.out.println("b is greater");
		}
		
		
//		if(a%2 == 0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");
//		}
	}

}
