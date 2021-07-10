package Arrays;

import java.util.Scanner;

public class arraySum {

	public static int sumArray(int arr[]) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = arr[i] + sum;

		}		
		return sum ;
	}

	private static void printArray(int[] arr) {
		//print array
		for(int i=0;i<arr.length;i++) {
			System.out.println (arr[i] + " ");
		}

	}

	private static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		//take input
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			//System.out.print(arr[i]);
			arr[i] = s.nextInt();
		}
		return arr;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = takeInput();
		printArray(arr);
		int sum = sumArray(arr);
		System.out.println("sum" +  sum);
	}

}

