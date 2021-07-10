package Recursion;

public class calculatePower {
	
	public static int power(int x, int n) {
		if(n == 0) {
			return 1;
		}
		int smallans = power(x,n - 1);
		return smallans *  x;
	}

	public static void main(String[] args) {
		
		int x = 2;
		int n = 5;
		int ans = power(x ,n);
		System.out.println(ans);
		// TODO Auto-generated method stub

	}

}
