package arraysCN;

import java.util.Scanner;

public class PrintAllPAirs {
	
	public static void PrintAllPairs(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				System.out.println("(" + arr[i] + "," + arr[j] + ")");
			}
		}
	}

	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] arr = new int[num];
		for(int i=0;i<num;i++) {
			System.out.println("index" + i);
			arr[i]=s.nextInt();		
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = takeInput();
//		printArray(arr);
		PrintAllPairs(arr);

	}

}
