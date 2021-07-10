package Recursion3;

import java.util.Scanner;

public class returnPermutations {
	
	public static String[] returnPermutations(String str) {
		if(str.length() == 0) {
			String ans[] = {" "};
			return ans;
		}
		String smallAns[] = returnPermutations(str.substring(1));
		String ans[] = new String[str.length()* smallAns.length];
		
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			String currentString = smallAns[i];
			for(int j=0;j<currentString.length();j++) {
				ans[k] = currentString.substring(0,j) + str.charAt(0) + currentString.substring(j);
				k++;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans[] = returnPermutations(str);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
