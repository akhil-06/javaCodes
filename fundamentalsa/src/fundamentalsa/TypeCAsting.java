package fundamentalsa;

import java.util.Scanner;

public class TypeCAsting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		char ch = 'A';
		int i = ch;
		System.out.println(i);
		
		char chu = (char)i;
		System.out.println(chu);
		
		
		short sh = 2;
		int in = sh;
		short sho = (short)in;
		System.out.println(in);
		System.out.println(sho);
	}

}
