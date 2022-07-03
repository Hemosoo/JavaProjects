import java.util.Scanner;

public class prob28 {
	static boolean[][] v;
	static String[][] grid;
	static int dx[] = { 0,0,-1,1 };
	static int dy[] = { -1,1,0,0 };
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			ans= 0;
			int y = in.nextInt();
			int x = in.nextInt();
			int startx = 0;
			int starty = 0;
			
			in.nextLine();
			v = new boolean[x][y];
			grid = new String[x][y];
			for(int i = 0; i < x; i++) {
				String line = in.nextLine();
				for(int j = 0; j < y; j++) {
					grid[i][j] = line.charAt(j)+"";
					if(grid[i][j].equals("T")) {
						startx = i;
						starty = j;
					}
				}
			}
			dfs(startx, starty, x, y);
			System.out.println(ans);
	}
	static void dfs(int i, int j, int x, int y) {
		if(i >= x || j >= y || i < 0 || j < 0) {
			return;
		}

		if(v[i][j]  || grid[i][j].equals("W")) return;
		v[i][j] = true;
		ans++;
		System.out.println(i + " " + j);
		if(grid[i][j].equals("D")) {
			System.out.println(ans);
			
		}
		for(int k=0; k<4; k++) {
			int nx = i + dx[k];
			int ny = j + dy[k];
			dfs(nx, ny, x, y);
		}
	}
}