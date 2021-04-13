package twoDarray;

import java.util.Scanner;

public class WavePrint {

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
	
	public static void printArrayWave(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		for(int j=0;j<cols;j++) {
			if(j%2 == 0) {
				for(int i=0;i<rows;i++) {
					System.out.println(arr[i][j] + " ");
				}
			}else {
				for(int i=rows-1;i>=0;i--) {
					System.out.println(arr[i][j] + " ");
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]arr = takeInput();
		printArray(arr);
		System.out.println();
		printArrayWave(arr);
	}

}
