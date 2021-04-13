package fundamentalsa;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int i=0;
		int n1=0;
		int n2=1;
		int c;
		while(i<num) {
			c=n1+n2;
			n1=n2;
			n2=c;
			i++;
		}
		System.out.println(n1);

	}

}
