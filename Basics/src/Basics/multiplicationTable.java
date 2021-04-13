package Basics;

import java.util.Scanner;

public class multiplicationTable {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i = 1;
		while(i <= 10)
		{
			System.out.println(i * n);
			i = i+1; 
		}
	}

}
