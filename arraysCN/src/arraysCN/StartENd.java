package arraysCN;

import java.util.Scanner;

public class StartENd {
	
	public static void printStartEndArray(int[] arr) {
		int n=arr.length;
		int val=1;
		int start=0;
		int end=(n-1);
		for(int i=0;i<n;i++) {
			arr[start]= val;
			val++;
			arr[end]=val;
			val++;
			start++;
			end--;
			System.out.println(arr[i]);
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
		int[] arr = takeInput();
//		printArray(arr);
		printStartEndArray(arr);
	}

}
