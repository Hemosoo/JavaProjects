import java.util.*;
import java.io.*;
public class _1987 {
	static int dr[] = { -1, 1, 0, 0 };
    static int dc[] = { 0, 0, -1, 1 };
    static int n, m, cnt;
    static String a[][];
    static boolean v[][];
    static ArrayList<Integer> ans, alph;
    static FastReader s;
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		init();
		solve();
	}
	public static void init() {
		n = s.nextInt();
		m = s.nextInt();
		ans = new ArrayList<Integer>();
		alph = new ArrayList<Integer>();
		a = new String[n][m];
		v = new boolean[n][m];
		for(int i = 0; i < n; i++) {
			String t = s.next();
			for(int j = 0; j < t.length(); j++) {
				a[i][j] = t.charAt(j)+"";
			}
		}
	}
	public static void solve() {
		
	}
	 static void dfs(int r, int c) {
		    
	        a[r][c]="";
	        
	        for(int i=0; i<4; i++) {
	            int nr = r + dr[i];
	            int nc = c + dc[i];
	            if(nr<0||nc<0||nr>=n||nc>=m||a[nr][nc]=="") continue;
	            
	            dfs(nr, nc);            
	        }
	    }
}
