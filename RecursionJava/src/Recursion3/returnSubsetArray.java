package Recursion3;

import java.util.Scanner;

public class returnSubsetArray {

	public static int[][] returnSubsetshelper(int []arr,int start) {
		if(start == arr.length) {
			int[][] output = new int[1][0];
			return output;
		}

		int[][] smallAns = returnSubsetshelper(arr, start + 1);
//		System.out.println("smalAns is = " + smallAns.length);
		int[][] ans = new int[2*smallAns.length][];
//		System.out.println("lengtth of ans = " + ans.length);

		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k] = new int[smallAns[i].length];
			for(int j=0;j<smallAns[i].length;j++) {
				ans[k][j] = smallAns[i][j];
			}
			k++;
		}
		for(int i=0;i<smallAns.length;i++) {
			ans[k] = new int[smallAns[i].length+1];
			ans[k][0] = arr[start];
			for(int j=1;j<=smallAns[i].length;j++) {
				ans[k][j] = smallAns[i][j-1];
			}
			k++;
		}
		return ans;
	}
	
	public static void printArray(int [][] ans) {
//		System.out.println("hello");
//		int rows = ans.length;
//		int cols = ans[0].length;
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[i].length;j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		} 
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
	
	public static int[][] returnSubsets(int []arr){
		return returnSubsetshelper(arr,0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = takeInput();
		int output[][] = returnSubsets(arr);
		printArray(output);
//		for(int i=0;i<output.length;i++) {
//			for(int j=0;j<output[i].length;j++) {
//				System.out.print(output[i][j] + " ");
//			}
//			System.out.println();
//		}
	}

}
