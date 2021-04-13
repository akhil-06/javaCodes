package stringCn;

import java.util.Scanner;

public class ReverseWordwise {
	
	public static String ReverseWordWise(String str) {
		int end = str.length();
		int i = str.length()-1;
		String Output = "";
		while(i>=0) {
			if(str.charAt(i) == ' ') {
				Output = Output + str.substring(i+1,end) + " ";
				end = i;
			}
			i--;
		}
		Output = Output + str.substring(i+1,end);
		return Output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String Str1 = ReverseWordWise(str);
		System.out.println(Str1);
	}

}
