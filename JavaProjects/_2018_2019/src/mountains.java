import java.io.*;
import java.util.*;
public class mountains {
	static PrintWriter out;
	static int N, x[], y[];
	static FastReader s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("mountains.in"));
			
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
		out = new PrintWriter(new File("mountains.out"));
		
		init();
		solve();
		out.close();
	}
	public static void init() {
		N = s.nextInt();
		x = new int[N];
		y = new int[N];
		for(int i = 0; i < N; i++) {
			x[i] = s.nextInt();
			y[i] = s.nextInt();
		}
		
	}
	public static void solve() {
		int see = 0;
		int ans=0;
		for(int i = 0; i < N; i++) {
			see = 1;
			for(int j = 0; j<N; j++) {
				if(i == j) continue;
				if(y[j] >= Math.abs(x[j]-x[i]) + y[i]) {
					see = 0;
					break;
				}
			}
			ans+=see;
		}
		out.println(ans);
	}
}
