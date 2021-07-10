package Strings;



public class printString {

	public static void print(String s) {
		for(int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		String str = "abcdefgh";
		print(str);
		
	}
}