package twoDarray;

import java.util.Scanner;

public class SumOfBoundaryElements {
	public static int BoundarySum(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int sum = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if(i == j) {
					sum = sum + arr[i][j];
				}else if(j == rows-1-i) {
					sum = sum + arr[i][j];
				}else if(i == 0 || j==0 || i == rows-1 || j == rows-1) {
					sum = sum + arr[i][j];
				}
			}
		}
		return sum;
	}
	
	public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the same no. of rows = ");
		int rows = s.nextInt();
		System.out.print("Cols must be same to rows = ");
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
		int sum = BoundarySum(arr);
		System.out.println(sum);
	}

}
