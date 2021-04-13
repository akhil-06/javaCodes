package fundamentalsa;

import java.util.Scanner;

public class SumofEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int es=0;
		int os=0;
		int r;
		while(n>0) {
			r=n%10;
			if(r%2==0) {
				es = es+r;
			}else {
				os=os+r;
			}
			n=n/10;
			
		}
		System.out.println(es + " " + os);
	}
	
}
