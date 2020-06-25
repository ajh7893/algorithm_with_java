package recursion;

public class Maze {

	private static int N = 8;
	private static int[][] maze = { 
			{ 0, 0, 0, 0, 0, 0, 0, 1 }, 
			{ 0, 1, 1, 0, 1, 1, 0, 1 }, 
			{ 0, 0, 0, 1, 0, 0, 0, 1 },
			{ 0, 1, 0, 0, 1, 1, 0, 0 }, 
			{ 0, 1, 1, 1, 0, 0, 1, 1 }, 
			{ 0, 1, 0, 0, 0, 1, 0, 1 },
			{ 0, 0, 0, 1, 0, 0, 0, 1 }, 
			{ 0, 1, 1, 1, 0, 1, 0, 0 }
			};

	private static final int PATHWAY_COLOR = 0;
	private static final int WALL_COLOR = 1;
	private static final int BLOCKED_COLOR = 2;
	private static final int PATH_COLOR = 3;

	public static boolean findMazePath(int x, int y) {

		//한계치 설정 - 0 보다 작고,N이면
		if (x < 0 || y < 0 || x >= N || y >= N)
			return false;
		//1,2,3 이면 
		else if (maze[x][y] != PATHWAY_COLOR)
			return false;
		//마지막에 도달했다면..
		else if (x == N - 1 && y == N - 1) {
			maze[x][y] = PATH_COLOR;
			return true;
		// 0이면 3으로...	
		} else {
			maze[x][y] = PATH_COLOR;
			//재귀함수..0,0에서 시작했으면 왼쪽부터 시계방향으로 길이 있는지 없는지 확인한다... 4방향으로..
			if (findMazePath(x - 1, y) || findMazePath(x, y + 1) || findMazePath(x + 1, y) || findMazePath(x, y - 1)) {
				return true;
			}
			//막힌 길은 2로.. 방문했던곳
			maze[x][y] = BLOCKED_COLOR;
			return false;
		}
	}
	public static void main(String[] args) {
		findMazePath(0, 0);
		for (int i = 0; i < maze.length; i++) {
			for (int j = 0; j < maze.length; j++) {
				System.out.print(maze[i][j]);
				System.out.print(" ");
				
			}
			System.out.println(" ");
		}
	}
}
