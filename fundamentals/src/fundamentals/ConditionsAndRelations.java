package fundamentals;

import java.util.Scanner;

public class ConditionsAndRelations {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.println("enter number A = ");
		a = s.nextInt();
		System.out.println("enter number B = ");
		b = s.nextInt();

		if( a == b) {
			System.out.println(" Equal");
		}else {
			System.out.println("Not Equal");
		}




		//		if(a > 0 || b > 0) {
		//			System.out.println("one is positive");
		//		}else {
		//			System.out.println("None is positive");
		//		}
		//
		//	}

	}
}
