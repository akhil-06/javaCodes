package fundamentalsa;

import java.util.Scanner;

public class AverageMArks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		char ch = str.charAt(0);
		
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = (a+b+c)/3;
		
		System.out.println(ch);
		System.out.println(d);

		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.println(min + " " + max);
	}

}
