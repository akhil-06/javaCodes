package stringCn;

import java.util.Scanner;

public class AllSubstrings {
	
	public static void printAllSubstrings(String str) {
		int len = str.length();
		//for printing like x,xy,xyz
//		for(int i=0;i<len;i++) {
//			for(int j=i;j<len;j++) {
//				System.out.println(str.substring(i,j+1));
//			}
//		}
		//for printing length wise substring like x,y,z,xy....
		for(int i=1;i<=len;i++) {
			for(int j=0;j<=len-i;j++) {
				int j2 = j+i-1;
				System.out.println(str.substring(j,j2+1));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printAllSubstrings(str);

	}

}
