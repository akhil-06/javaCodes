package Recursion3;

import java.util.Scanner;

public class printSubsets {

	public static void printSubsets(int [] arr, int SI,int [] outputsoFar) {
		if(arr.length == SI) {
			for(int i=0;i<outputsoFar.length;i++) {
				System.out.print(outputsoFar[i] + " ");
			}
			System.out.println();
			return;
		}
		//when 1st element is included
		int newoutput[] = new int[outputsoFar.length+1];
		int i=0;
		for(;i<outputsoFar.length;i++) {
			newoutput[i] = outputsoFar[i];
		}
		newoutput[i] = arr[SI];
		printSubsets(arr,SI+1,outputsoFar);
		
		//when 1st element not included
		printSubsets(arr,SI+1,newoutput);
		
	}
	
//	public static void printArray(int [][] ans) {
//		int rows = ans.length;
//		int cols = ans[0].length;
//		for(int i=0;i<rows;i++) {
//			for(int j=0;j<cols;j++) {
//				System.out.print(ans[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}

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
	public static void printSubsets(int[] arr) {
		int [] outputsoFar = new int[0];
		printSubsets(arr,0,outputsoFar);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		printSubsets(arr);
//		printArray(ans);
	}

}
