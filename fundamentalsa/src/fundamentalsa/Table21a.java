package fundamentalsa;

import java.util.Scanner;

public class Table21a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int query = s.nextInt();
		int a = s.nextInt();
		double b = s.nextInt();
		int n = s.nextInt();
		double ans=a;
//		double result=0;
		for(int i=0;i<=n-1;i++) {
			ans += (Math.pow(2, i)*b);
			
//			result = ans+a;
			System.out.println(ans);
		}
		
	}

}
