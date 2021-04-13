package arraysCN;

import java.util.Scanner;

public class TakinginputFunctions {
	
	public static void printArray(int[] arr) {
		int num= arr.length;
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
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
		printArray(arr);
	}

}
