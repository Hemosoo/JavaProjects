import java.util.*;
import java.io.*;
public class loanredo {
	static PrintWriter out;
	static long N, K, M;
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
		long max = N;
		long min = 1;
		long ans = 0;
		long mid = 0;
		while(min<=max) {
			mid = (min+max)/2;
			if(check(mid)) {
				ans = mid;
				min = mid + 1;
			}
			else {
				max = mid-1;
			}
		}
		out.println(ans);
	}
	public static boolean check(long mid) {
		long days = K;
		long left = N;
		while(days > 0 && left > 0) {
			long y = left/mid;
			if(y<M) return days*M >= left;
			long pass = 1 + ((left - mid*y)/y);
			days-=pass;
			left-=left*pass;
		}
		return left<=0;
	}
}
