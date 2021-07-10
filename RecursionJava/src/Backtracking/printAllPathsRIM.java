package Backtracking;

public class printAllPathsRIM {

	private static void solveMazeAllPaths(int[][] maze,int i,int j,int[][] path) {
		int n=maze.length;
		//checking the valid cell or not
		if(i<0||j<0||i>=n||j>=n||maze[i][j]==0||path[i][j]==1) {
			return;
		}

		//include current cell to path(jisne saari cond. pass krli)
		path[i][j] = 1;

		//now destination cell
		if(i == n-1 && j == n-1) {
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c] + " ");
				}
				System.out.println();
			}
//			System.out.println();
			System.out.println();
			path[i][j] = 0;
			return;
		}
		//now explore all directions
		//top
		solveMazeAllPaths(maze, i-1, j, path);
		//right
		solveMazeAllPaths(maze, i, j+1, path);
		//left
		solveMazeAllPaths(maze, i, j-1, path);
		//bottom
		solveMazeAllPaths(maze, i+1, j, path);
		
		path[i][j] = 0;
	}


	public static void printAllPAthsRIM(int [][]maze) {
		int n=maze.length;
		int path[][] = new int[n][n];
		solveMazeAllPaths(maze,0,0,path);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = {{1,1,0}, {1,1,1}, {1,1,1}};
		printAllPAthsRIM(maze);

	}

}
