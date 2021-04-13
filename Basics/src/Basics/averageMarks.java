package Basics;

import java.util.Scanner;

public class averageMarks {

	public static void main(String[] args) {
	

		int a,b,c;
		

		Scanner s =new Scanner (System.in);
		String str=s.next();
		char ch = str.charAt(0);
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		System.out.println(ch);
        System.out.print((a+b+c)/3);
		
		
	}
	
}

