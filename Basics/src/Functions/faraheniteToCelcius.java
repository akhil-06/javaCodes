package Functions;

import java.util.Scanner;

public class faraheniteToCelcius {

	public static int faherenheitToCelcius(int S, int E, int W) {
		int result =0;
		while( S <= E)
		{
			result = S+(S-32)*5/9;
			S = S+W;
		}
		return result ;

	}
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int	S = s. nextInt();
		int E = s. nextInt();
		int  W = s. nextInt();
		int result = faherenheitToCelcius(S, E, W);
		System.out.println(result);

	}

}
