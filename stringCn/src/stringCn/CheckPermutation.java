package stringCn;

import java.util.Scanner;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		
		//make this as a function then it works
		int[] freq = new int[256];
		for(int i=0;i<256;++i) {
			freq[i]=0;
		}
		if(str1.length() != str2.length()) {
			System.out.println("false");
		}
		for(int i=0;i<str1.length();i++) {
			char ch = str1.charAt(i);
			++freq[ch];
		}
		for(int i=0;i<str2.length();i++) {
			char ch = str2.charAt(i);
			--freq[ch];
		}
		for(int i=0;i<256;++i) {
			if(freq[i] != 0) {
				System.out.println("false");
			}else {
				System.out.println("true");
			}
		}
	}

}
