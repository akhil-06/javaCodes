package Strings;

public class printPrefix {
	
	public static void printprefix(String str) {
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.substring(0, i + 1));
		}
	}

	public static void main(String[] args) {
		
		String str = "abcde";
		printprefix(str);
		
		// TODO Auto-generated method stub

	}

}
