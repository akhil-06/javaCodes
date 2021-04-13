package Recursion3;

import java.util.Scanner;

public class returnSubsequences {

	public static String[] returnSubsequences(String str) {
		if(str.length() == 0) {
			String ans[] = {" "};
			return ans;
		}
		String smallAns[] = returnSubsequences(str.substring(1));
		String ans[] = new String[2*smallAns.length];


		//for copyimg the small ans result in ans
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k] = smallAns[i];
			k++;
		}

		//for attaching the char(0) to smallAns
		for(int i=0;i<smallAns.length;i++) {
			ans[k] = str.charAt(0) + smallAns[i];
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans[] = returnSubsequences(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
