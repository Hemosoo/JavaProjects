import java.io.*;
import java.util.*;
public class connectbarns {
	static FastReader s;
	static int T, N, M;
	static ArrayList<Integer>[] a1, a2;
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
		T = s.nextInt();
		for(int i = 0; i < T; i++) {
			init();
			solve();
		}
	}
	public static void init() {
		N = s.nextInt();
		M = s.nextInt();
		a1 = new ArrayList[N+1];
		a2 = new ArrayList[N+1];
	}
	public static void solve() {
		
	}
}
