import java.util.*;
import java.io.*;
public class loan {
	static long N, K, M;
	static PrintWriter out;
	static FastReader s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("loan.in"));
			
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		out = new PrintWriter(new File("loan.out"));
		s = new FastReader();
		init();
		solve();
		out.close();
	}
	public static void init() {
		N = s.nextLong();
		K = s.nextLong();
		M = s.nextLong();
	}
	public static void solve() {
		long min = 1;
		long max = N;
		long ans = 0;
		long mid = 0;
		while(min <= max) {
			mid = (min+max)/2;
			if(check(mid)) {
				ans = mid;
				min = mid+1;
				
			}
			else {
				max = mid-1;
			}
		}
		out.println(ans);
	}
	static boolean check(long x) {
		long left = N;
		long days = K;
		
		while(left > 0 && days > 0) {
			long y = left/x;
			if(y<M) return M*days >= left;
			long pass = 1 + ((left - x*y)/y);
			left -= y*pass;
			days-=pass;
		}
		return left<=0;
	}
}
