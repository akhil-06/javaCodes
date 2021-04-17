package Recursion3;

import java.util.Scanner;

public class returnSubsetsSumK {

	public static int[][] returnSubsetsSumKhelper(int arr[] , int SI,int k){
		if(SI == arr.length) {
			if(k == 0) {
				int output[][]=new int[1][0];
				return output;
			}else {
				int output[][]=new int[0][0];
				return output;
			}
		}
		int[][] smallOutput1 = returnSubsetsSumKhelper(arr,SI+1,k);
		int[][] smallOutput2 = returnSubsetsSumKhelper(arr,SI+1,k-arr[SI]);

		int[][] Output = new int[smallOutput1.length + smallOutput2.length][];

		int index=0;
		for(int i=0;i<smallOutput1.length;i++) {
			Output[index] = smallOutput1[i];
			index++;
		}

		for(int i=0;i<smallOutput2.length;i++) {
			Output[index]  = new int[smallOutput2[i].length+1];
			Output[index][0] = arr[SI];
			for(int j=0;j<smallOutput2[i].length;j++) {
				Output[index][j+1] = smallOutput2[i][j];
			}
			index++;
		}

		return Output;
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

	public static int [][] returnSubsetsSumK(int []arr,int k){
		return returnSubsetsSumKhelper(arr,0,k);
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value of K = ");
		int k = s.nextInt();
		int output[][] = returnSubsetsSumK(arr,k);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}

}
