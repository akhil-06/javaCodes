package Recursion1;

import java.util.Scanner;

public class sumOfArrays {
	
	private static int ArraySum(int[] arr,int startIndex) {
		if(startIndex == arr.length ) {
			return 0;
		}
		return arr[startIndex] + ArraySum(arr,startIndex+1);
//		return sa;
	}
	
	public static int ArraySum(int[] arr) {
		int startIndex = 0;
		return ArraySum(arr,startIndex);
	}
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int []arr = new int[num];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the " + i + "th element of array = ");
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= takeInput();
		int sum = ArraySum(arr);
		System.out.println(sum);
	}

}
