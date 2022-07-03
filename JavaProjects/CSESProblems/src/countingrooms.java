import java.util.*;


import java.io.*;
public class countingrooms {
	static FastReader s;
	static int a, b;
	static char[][] arr;
	static boolean[][] v;
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
		a = s.nextInt();
		b = s.nextInt();
		arr = new char[a][b];
		v = new boolean[a][b];
		for(int i = 0; i < a; i++) {
			String s1 = s.next();
			for(int j = 0; j < b; j++) {
				arr[i][j] = s1.charAt(j);
			}
		}
		//System.out.println(Arrays.deepToString(arr));
		int cnt = 0;
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				if(!v[i][j] && arr[i][j] != '#') {
					dfs(i, j);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
	static void dfs(int i, int j) {
		if(i < 0 || i >= a || j < 0 || j >= b) {
			return;
		}
		if(v[i][j]) return;
		if(arr[i][j] == '#') return;
		v[i][j] = true;
		dfs(i+1, j);
		dfs(i, j+1);
		dfs(i-1, j);
		dfs(i, j-1);
	}
}
