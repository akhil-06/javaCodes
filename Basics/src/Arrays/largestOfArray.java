package Arrays;

import java.util.Scanner;

public class largestOfArray {

	public static int largestinarray(int arr[]) {
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}		
		}
		return max;
	}

	private static void printArray(int[] arr) {
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.print (arr[i] + " ");
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

	public static void main(String[] args) {

		int arr[] = takeInput();
		printArray(arr);
		int largest = largestinarray(arr);
		System.out.println("largest" +  largest);
	}

}
