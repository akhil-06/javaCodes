package Functions;

import java.util.Scanner;

public class addingTwoNumbers {
	
	public static int addingNum(int a , int b) {
		
	int	sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		
		int sum = addingNum( a , b);
		
		System.out.println(sum);
				
	
		

	}

}
