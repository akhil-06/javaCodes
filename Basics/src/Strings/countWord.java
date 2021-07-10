package Strings;

public class countWord {
	
	public static int countword(String str) {
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		
		}
		count = count + 1;
		return  count;
	}

	public static void main(String[] args) {
		
		String str = "Coding Ninjas";
		int count = countword(str);
		System.out.println(count);
		// TODO Auto-generated method stub

	}

}
