package twoDarray;

import java.util.Scanner;

public class LargestRowOrColumnSum {
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
	
		public static int largestRowSum(int[][] arr) {
			int rows = arr.length;
			int cols = arr[0].length;
			int maxRowSum = Integer.MIN_VALUE;
			for(int i=0;i<rows;i++) {
				int sum =0;
				for(int j=0;j<cols;j++) {
					sum = sum + arr[i][j];
				}
				if(sum>maxRowSum) {
					maxRowSum = sum;
				}
			}
			return maxRowSum;
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
		int colLargest = largestColSum(arr);
		int rowLargest = largestRowSum(arr);
		int max = Integer.MIN_VALUE;
		if(colLargest > rowLargest) {
			max = colLargest;
			System.out.println("Column sum is largest = " + colLargest);
		}else {
			max = rowLargest;
			System.out.println("Row sum is largest = " + rowLargest);
		}
	}

}
