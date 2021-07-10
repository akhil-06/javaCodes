package TwoDarrays;

import java.util.Scanner;

public class RowWiseSum {

	public static void rowisesum(int arr[][]) {
		int rows = arr.length;
		int cols = arr[0].length;
	
		for(int i = 0; i < rows; i++) {
			int sum = 0;
			for(int j = 0; j < cols; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println(" row wise sum" + sum);
		}
		
	}

	public static int[][] takeinput() {
		// for taking input
		Scanner s = new Scanner(System.in);
		System.out.println("enter no. of rows");
		int rows = s.nextInt();
		System.out.println("enter no. of columns");
		int cols = s.nextInt();
		int input[][] = new int [rows][cols];
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.println("enter element at" + i + "row" + j + "column");
				input[i][j] = s.nextInt();
			}
		}
		return input;
	}

	public static void print(int input[][]) {
		// for output or print
		int rows = input.length;
		int cols = input[0].length;

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		int arr[][] = takeinput();
		print(arr);
		rowisesum(arr);
	}

}


