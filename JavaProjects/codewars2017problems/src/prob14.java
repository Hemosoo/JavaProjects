import java.util.*;
import java.io.*;
public class prob14 {
	static boolean[][] v;
	static String[][] grid;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			ans= 0;
			int x = in.nextInt();
			int y = in.nextInt();
			in.nextLine();
			if(x == 0 && y == 0) break;
			v = new boolean[x][y];
			grid = new String[x][y];
			for(int i = 0; i < x; i++) {
				String line = in.nextLine();
				for(int j = 0; j < y; j++) {
					grid[i][j] = line.charAt(j)+"";
				}
			}
			dfs(0, 0, x, y);
			System.out.println(ans);
		}
	}
	static void dfs(int i, int j, int x, int y) {
		if(i >= x || j >= y) {
			return;
		}
		if(v[i][j]  || grid[i][j].equals("#")) return;
		v[i][j] = true;
		if(i == x-1 && j == y-1) {
			ans++;
		}
		dfs(i+1, j, x, y);
		dfs(i, j+1, x, y);
	}
}
/*
4 4
....
....
....
....
4 4
....
....
....
...#
4 4
.#..
.#..
.#..
.#..
20 20
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
....................
.....#..............
....................
....................
0 0
 */