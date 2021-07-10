package Recursion;

public class NaturalNoSum {

	public static int sum(int n) {
		
		if ( n == 1) {
			return 1;
		}
		int smallans = sum( n - 1);
		return n + sum(n - 1);
	}
	
	public static void main(String[] args) {
		
		int n = 4;
		int ans = sum(n);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
