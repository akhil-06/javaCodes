package fundamentals;

import java.util.Scanner;

public class CharacterCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);

		if(ch >= 'A' && ch <= 'Z') {
			System.out.println(1);
		}else if(ch >= 'a' && ch <= 'z') {
			System.out.println(0);
		}else {
			System.out.println(-1);
		}
	}

}
