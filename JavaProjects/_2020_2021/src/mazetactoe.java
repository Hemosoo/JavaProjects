import java.util.*;

import java.io.*;
public class mazetactoe {
	static FastReader s;
	static int n, stI, stJ, ans;
	static String[][] grid;
	static boolean[][] v;
	static char[][] t;
	static int visit;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new InputStreamReader(System.in));
			
		}
		String next() { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try { 
                    st = new StringTokenizer(in.readLine()); } 
                catch (IOException  e) { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
		int nextInt() {
			return Integer.parseInt(next());
		}
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		init();
		solve();
		
	}
	public static void init() {
		visit = 0;
		n = s.nextInt();
		v = new boolean[n][n];
		grid = new String[n][n];
		t = new char[3][3];
		for(int i = 0; i < n; i++) {
			String line = s.next();
			//System.out.println(line);
			for(int j = 0; j < n*3; j+=3) {
				grid[i][j/3] = line.substring(j, j+3);
				if(line.substring(j, j+3).equals("BBB")) {
					stI = i;
					stJ = j/3;
				}
			}
		}
		//System.out.println(stI + " " + stJ);
	}
	public static void solve() {
		ans = 0;
		tfill(t);
		dfs(stI, stJ);
		System.out.println(ans);
	}
	public static boolean check(char[][] a) {
		if(a[0][0] == 'M' && a[1][1] == 'O' && a[2][2] == 'O') {
			return true;
		} else if(a[0][0] == 'O' && a[1][1] == 'O' && a[2][2] == 'M') {
			return true;
		} else if((a[0][2] == 'M' && a[1][1] == 'O' && a[2][0] == 'O')||(a[0][2] == 'O' && a[1][1] == 'O' && a[2][0] == 'M') ) {
			return true;
		} else {
			for(int i = 0; i < 3; i++) {
				if((a[i][0] == 'M' && a[i][1] == 'O' && a[i][2] == 'O') || (a[i][0] == 'O' && a[i][1] == 'O' && a[i][2] == 'M')) {
					return true;
				}
				else if((a[0][i] == 'M' && a[1][i] == 'O' && a[2][i] == 'O') || (a[0][i] == 'O' && a[1][i] == 'O' && a[2][i] == 'M')) {
					return true;
				}
			}
		}
		
		return false;
	}
	public static void dfs(int i, int j) {
		if(v[i][j]) return;
		if(i < 0 || j < 0 || i >= n || j >= n) return;
		
		String s = grid[i][j];
		if(!s.equals("...")) v[i][j] = true;
		if(s.equals("###")) return;
		if(s.charAt(0) == 'O' || s.charAt(0) == 'M') {
			if(t[Character.getNumericValue(s.charAt(1))-1][Character.getNumericValue(s.charAt(2))-1] == '.') {
				t[Character.getNumericValue(s.charAt(1))-1][Character.getNumericValue(s.charAt(2))-1] = s.charAt(0);
				if(check(t)) {
					v = new boolean[n][n];
					t = new char[3][3];
					tfill(t);
					ans++;
				} 
			}
		}
		dfs(i+1, j);
		dfs(i-1, j);
		dfs(i, j-1);
		dfs(i, j+1);
	}
	static void tfill(char[][] t) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				t[i][j] = '.';
			}
		}
	}
} 
