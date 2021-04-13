package fundamentals;

import java.util.Scanner;

public class LargestOfTwoInJava {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		a = s.nextInt();
		b = s.nextInt();

		if( a > b) {
			System.out.println("First number is greater");
		}else if(b > a) {
			System.out.println("Second num is greater");
		}else {
			System.out.println("second is greater");
		}
		

	//		if( a > b) {
	//			System.out.println("First number is greater");
	//		}else{
	//			if(b > a) {
	//				System.out.println("Second num is greater");
	//			}else {
	//				System.out.println("second is greater");
	//			}
	//		}


}
}
