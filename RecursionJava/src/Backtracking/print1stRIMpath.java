package Backtracking;

public class print1stRIMpath {

	public static boolean solveMaze(int[][] maze, int i, int j,int [][] path) {
		//checking the valid cell or not
		int n = maze.length;

		if(i<0||j<0||i>=n||j>=n||maze[i][j]==0||path[i][j]==1) {
			//			ystem.out.print("no path here");
			return false;
		}
		//include the current cell
		path[i][j] = 1;
		
		//destination cell
		if(i == n-1 && j == n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println();
			}
			return true;
		}
		if(solveMaze(maze, i-1, j, path)) {
			return true;
		}

		//right
		if(solveMaze(maze, i, j + 1, path)) {
			return true;
		}

		//left
		if(solveMaze(maze, i, j -1, path)) {
			return true;
		}

		//bottom
		if(solveMaze(maze, i+1, j, path)) {
			return true;
		}

		return false;
	}

	public static boolean printratInMaze(int[][] maze) {
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze,0,0,path);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = {{1,1,0}, {1,1,1}, {1,1,1}};
		boolean ans = printratInMaze(maze);
		System.out.println(ans);
	}

}
