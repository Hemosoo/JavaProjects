import java.util.*;
import java.io.*;

public class convolutedint {
	static int N, M;
	static long k[], a[], b[];
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
		N = s.nextInt();
		M = s.nextInt();
		a = new long[M+1];
		b = new long[M+1];
		for(int i = 1; i <= N; i++) {
			a[s.nextInt()]++;
			b[s.nextInt()]++;
		}
		k = new long[2*M +2];
		for(int i = 0; i <= M; i++) {
			for(int j = 0; j <= M; j++) {
				k[i+j] += a[i] *a[j];
				k[i+j+1] -= b[i]*b[j];
			}
		}
		
		//System.out.println(Arrays.toString(k));
	}
	public static void solve() {
		for(int i = 1; i <= M*2 + 1; i++) {
			k[i]+=k[i-1];
			System.out.println(k[i-1]);
		}
		
	}
}
