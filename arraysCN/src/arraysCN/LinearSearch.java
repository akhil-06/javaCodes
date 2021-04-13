package arraysCN;

import java.util.Scanner;

public class LinearSearch {
	
	public static void linearSearch(int[] arr,int n) {
		int num=arr.length;
		for(int i=0;i<num;i++) {
			if(arr[i] == n) {
				System.out.println("index at elemnt is = " + i);
			}
		}
	}
	
//	public static void printArray(int[] arr) {
//		int num= arr.length;
//		for(int i=0;i<num;i++) {
//			System.out.println("arr is " + arr[i]);
//		}
//	}

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
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = takeInput();
//		printArray(arr);
		linearSearch(arr,n);

	}

}
