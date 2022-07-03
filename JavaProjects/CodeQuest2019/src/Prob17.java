import java.util.*;
import java.io.*;

public class Prob17 {

    static String file = "Prob17";
    static Scanner in;
    static PrintWriter out;
    
    static int n;
    
    public static void main(String[] args)throws IOException{
        
        in = new Scanner(new File(file+".in.txt"));
        //in = new Scanner(System.in);
        out = new PrintWriter(new File("out.txt"));
        
        init();
        solve();
        
        

        in.close();
        out.close();
        Check.check(file+".out.txt");
    }
    
    public static void init() {
		n = in.nextInt();
		
	}
	public static void solve() {
		for(int k = 0; k < n; k++) {
			int[][] grid = new int[10][10];
			
			int n1 = in.nextInt();
			for(int i = 0; i < 10; i++) {
				String t = in.next();
				for(int j = 0; j < 10; j++) {
					grid[i][j] = Integer.parseInt(t.charAt(j)+"");
				}
			}
			for(int l = 0; l < n1; l++) {
				int[][] ngrid = new int[10][10];
				for(int i = 0; i < 10; i++) {
					for(int j = 0; j < 10; j++) {
						int num = check(grid, i, j);
						if(grid[i][j] == 1) {
							//System.out.println(check(grid, i, j));
							
							if((num <= 1) || num >= 4) {
								ngrid[i][j] = 0;
							} else {
								ngrid[i][j] = 1;
							}
						} else {
							if(num == 3) {
								ngrid[i][j] = 1;
							}
						}
					}
				}
				grid = ngrid.clone();
			}
			for(int i = 0; i < 10; i++) {
				String line = "";
				for(int j = 0; j < 10; j++) {
					line+=grid[i][j];
				}
				out.println(line);
				
			}
			//System.out.println(Arrays.deepToString(grid));
		}
	}
	public static int check(int[][] grid, int i, int j) {
		int a = 0;
		if(i-1 >= 0 && j-1 >= 0 && grid[i-1][j-1] == 1) {
			a++;
		} if(i-1 >= 0 && j >= 0 && grid[i-1][j] == 1) {
			a++;
		} if(i-1 >= 0 && j+1 < 10 && grid[i-1][j+1] == 1) {
			a++;
		} if(i >= 0 && j+1 < 10 && grid[i][j+1] == 1) {
			a++;
		} if(i+1 < 10 && j+1 < 10 && grid[i+1][j+1] == 1) {
			a++;
		} if(i+1 < 10 && j < 10 && grid[i+1][j] == 1) {
			a++;
		} if(i+1 < 10 && j-1 >= 0 && grid[i+1][j-1] == 1) {
			a++;
		} if(i < 10 && j-1 >= 0 && grid[i][j-1] == 1) {
			a++;
		}
		return a;
	}
}
/*
1
4
0000000000
0000000000
0000000000
0000011000
0000010000
0000000000
0000000000
0000000000
0000000000
0000000000
 */
