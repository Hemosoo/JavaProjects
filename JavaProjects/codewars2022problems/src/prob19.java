import java.util.*;
import java.io.*;
public class prob19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		int ans = 0;
		String[][] grid = new String[n][n];
		for(int i = 0; i < n; i++) {
			String line = in.nextLine();
			for(int j = 0; j < n; j++) {
				grid[i][j] = line.charAt(j)+"";
			}
		}
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n-k; i++) {
				for(int j = 0; j < n-k; j++) {
					boolean inv = false;
					for(int l = i; l <= i+k; l++) {
						for(int h = j; h <= j+k; h++) {
							if(grid[l][h].equals("#")) inv = true;
						}
					}
					if(!inv) ans++;
				}
			}
		}
		
		System.out.println(ans);
		
	}		
}
/*
5
#....
.....
.....
.....
..#..

5
.....
.....
.....
.....
.....
*/