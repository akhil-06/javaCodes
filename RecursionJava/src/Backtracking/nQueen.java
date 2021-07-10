package Backtracking;

import java.util.Scanner;

public class nQueen {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		placeNQueen(n);

	}

	private static void placeNQueen(int n) {
		int board[][] = new int[n][n];
		placeQueen(board,0,n);
		
	}

	private static void placeQueen(int[][] board, int row, int n) {
		if(row == n) {
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(board[i][j] + " ");
				}
				System.out.println();
			}
		}
		for(int j=0;j<n;j++) {
			if(isBoaradSafe(board,row,j)) {
				board[row][j] = 1;
				placeQueen(board,row+1,n);
				board[row][j] =0;
			}
		}
		
	}

	private static boolean isBoaradSafe(int[][] board, int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}

}
