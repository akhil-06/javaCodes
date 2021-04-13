package twoDarray;

import java.util.Scanner;

public class ColumnwiseSum {

	public static int largestColSum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int maxColSum = Integer.MIN_VALUE;
		for(int j=0;j<cols;j++) {
			int sum =0;
			for(int i=0;i<rows;i++) {
				sum = sum + arr[i][j];
			}
			if(sum>maxColSum) {
				maxColSum = sum;
			}
		}
		return maxColSum;
	}

	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of rows = ");
		int rows = s.nextInt();
		System.out.print("Enter the no. of cols = ");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print("enter the " + i + "row " + j + "col = ") ;
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = takeInput();
		int largest = largestColSum(arr);
		System.out.println("##Largest col sum is = " + largest);
	}

}
