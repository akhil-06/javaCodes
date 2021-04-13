package fundamentalsa;

import java.util.Scanner;

public class SumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int c= s.nextInt();
		int i=1;
		int ans=0;
		int aNs=1;
		if(c == 1) {
			while(i<=num) {
				ans= ans+i;
				i++;
			}
			System.out.println(ans);
		}else if(c==2) {
			while(i<=num) {
				aNs=aNs*i;
				i++;
			}
			System.out.println(aNs);
		}else {
			System.out.println("No output");
		}

	}

}
