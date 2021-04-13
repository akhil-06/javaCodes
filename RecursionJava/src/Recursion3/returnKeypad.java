package Recursion3;

import java.util.Scanner;

public class returnKeypad {
	
	public static String[] returnKeypads(int num) {
		if(num == 0) {
			String arr[] = {""};
			return arr;
		}
		String smallerArray[] = returnKeypads(num/10);
		String smallans[] = findAlphabets(num%10);
//		char options[] = new char[4];
		String ans[] = new String[smallans.length * smallerArray.length];
		
		
		int k=0;
		for(int i=0;i<smallans.length;i++) {
			for(int j=0;j<smallerArray.length;j++) {
				ans[k] = smallerArray[j] + smallans[i];
				k++;
			}
		}
		return ans;
	}

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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String ans[] = returnKeypads(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
