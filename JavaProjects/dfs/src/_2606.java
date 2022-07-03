import java.io.*;
import java.util.*;

public class _2606 {
	static FastReader s;
	static boolean v[];
	static ArrayList<Integer>[] a;
	static int n, o, ans;
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
		
	}
	public static void init() {
		n = s.nextInt();
		v = new boolean[n];
		a = new ArrayList[n];
		o = s.nextInt();
		for(int i = 0; i < n ; i++) {
			a[i] = new ArrayList<Integer>();
			
		}
		for(int i = 0; i < o; i++) {
			int x = s.nextInt()-1;
			int y = s.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}
		dfs(0);
		System.out.println(ans);
	}
	static void dfs(int i) {
		v[i] = true;
		for(int e:a[i]) {
            if(!v[e]) {                
                dfs(e);
                ans++;
            }
        }
	}
}
