package twoDarray;

import java.util.Scanner;

public class TakingInputAndPrintingViaFunctions {
	public static int[][] takeInput(){
		Scanner s= new Scanner(System.in);
		System.out.print("Enter the number of rows = ");
		int rows = s.nextInt();
		System.out.print("Enter the number of cols = ");
		int cols = s.nextInt();
		int [][] arr = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print("Enter the " + i + "row " + j + "col = ");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void printArray(int [][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr = takeInput();
		printArray(arr);
	}

}
