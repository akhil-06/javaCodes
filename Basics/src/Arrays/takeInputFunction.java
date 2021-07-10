 package Arrays;

import java.util.Scanner;

public class takeInputFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = takeInput();
		printArray(arr);
	}

	private static void printArray(int[] arr) {
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Size of array you want = ");
		int num = s.nextInt();
		//take input
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter element for " + i + "th position = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

}
