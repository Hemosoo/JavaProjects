import java.io.*;
import java.util.*;
public class ClosestCowWins {
	static FastReader s;
	static long ans, t[];
	static int K, M, N, max;
	
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
		K = s.nextInt();
		M = s.nextInt();
		N = s.nextInt();
		max = 0;
		t = new long[1000000000];
		for(int i = 0; i < K; i++) {
			int ind = s.nextInt();
			long ta = s.nextLong();
			t[ind] = ta;
			max = Math.max(max, ind);
		}
		for(int i = 0; i < N; i++) {
			int ind = s.nextInt();
			t[ind] = -1;
		}
		System.out.println(Arrays.toString(t));
		System.out.println();
	}
	public static void solve() {
		
	}
}
