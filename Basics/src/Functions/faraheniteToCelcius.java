package Functions;

import java.util.Scanner;

public class faraheniteToCelcius {


	public static void printFahrenheitTable(int start, int end, int step) {
		double fh=0;
		int i=start;
		while(i<=end) {
			fh=(double)5/9*(start-32);
			System.out.print(start+"\t"+(int)(fh));
			System.out.println();
			start=start+step;
			i=i+step;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		printFahrenheitTable(start, end, step);
	}
}




