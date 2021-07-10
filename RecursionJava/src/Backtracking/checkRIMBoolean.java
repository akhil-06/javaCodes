package Backtracking;

public class checkRIMBoolean {

	public static boolean solveMaze(int[][] maze,int start,int dest,int[][] path) {
		int n = maze.length;
		//to check wheather the cell is valid or not
		if(start < 0 || dest < 0 || start >= n || dest >= n || maze[start][dest] == 0 || path[start][dest] == 1){
			return false;
		}

		//include the current cell in path
		path[start][dest] = 1;

		//destination cell
		if(start == n-1 && dest == n-1) {
			return true;
		}

		//now explore all the directions 
		//top
		if(solveMaze(maze, start-1, dest, path)) {
			return true;
		}

		//right
		if(solveMaze(maze, start, dest + 1, path)) {
			return true;
		}

		//left
		if(solveMaze(maze, start, dest -1, path)) {
			return true;
		}

		//bottom
		if(solveMaze(maze, start+1, dest, path)) {
			return true;
		}
		return false;
	}

	public static boolean ratInMaze(int [][]maze) {
		int n = maze.length;
		int path[][] = new int[n][n];
		return solveMaze(maze,0,0,path);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maze[][] = {{1,1,0}, {1,1,1}, {0,0,0}};
		boolean ans = ratInMaze(maze);
		System.out.println(ans);
	}

}
