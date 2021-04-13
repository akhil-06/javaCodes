package Basics;

import java.util.Scanner;

public class faherenheitToCelciusTable {

	public static void main(String[] args) {
		int S,E,W;
//		S = starting temp
//		E = endinf temp.
//		W = size gap
		Scanner s = new Scanner(System.in);
		S = s. nextInt();
		E = s. nextInt();
		W = s. nextInt();
		
		while( S <= E)
		{
			System.out.println(S+" "+(S-32)*5/9);
			S = S+W;
		}

	}

}
