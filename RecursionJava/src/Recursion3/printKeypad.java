package Recursion3;

import java.util.Scanner;

public class printKeypad {
	
	public static String[] findAlphabets(int num) {
		if(num <= 1 || num > 10) {
			System.exit(0);
		}
		String ans[] = {""};
		if(num==2) {
			String output[] = {"a","b","c"};
			return output;
		}
		if(num==3) {
			String output[] = {"d","e","f"};
			return output;
		}
		if(num==4) {
			String output[] = {"g","h","i"};
			return output;
		}
		if(num==5) {
			String output[] = {"j","k","l"};
			return output;
		}
		if(num==6) {
			String output[] = {"m","n","o"};
			return output;
		}
		if(num==7) {
			String output[] = {"p","q","r","s"};
			return output;
		}
		if(num==8) {
			String output[] = {"t","u","v"};
			return output;
		}
		if(num==9) {
			String output[] = {"w","x","y","z"};
			return output;
		}
		return ans;
	}
	
	public static void printKeypads(int num,String outputsoFar) {
		if(num==0) {
			System.out.println(outputsoFar);
			return;
		}
		
		//when we decide to attach which character in string
		String singleDigitOutput[] = findAlphabets(num%10);
		for(int i=0;i<singleDigitOutput.length;i++) {
			printKeypads(num/10,singleDigitOutput[i]+outputsoFar);
		}
	}
	
	public static void printKeypads(int num) {
		printKeypads(num,"");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		printKeypads(n);
	}

}
