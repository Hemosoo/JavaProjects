import java.util.*;
import java.io.*;
public class C_125 {
	static int N, l[], r[], max;
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
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		init();
		solve();
		
	}
	public static void init() {
		max = 0;
		N = s.nextInt();
		l = new int[N];
		r = new int[N];
		for(int i = 0; i < N; i++ ) {
			l[i] = r[i] = s.nextInt();
		}
	}
	public static void solve() {
		for(int i = 1; i < N; i++) {
			
				l[i] = gcd(l[i], l[i-1]);
		}
		for(int i = N-2; i >= 0; i--) {
				r[i] = gcd(r[i], r[i+1]);
		}
		max = r[1];
		for(int i = 1; i < N-1; i++ ) {
			int temp = gcd(l[i-1], r[i+1]);
			max = Math.max(max, temp);
		}
		max = Math.max(max, l[N-2]);
		//System.out.println(Arrays.toString(l));
		//System.out.println(Arrays.toString(r));
		System.out.println(max);
	}
	static int gcd(int a, int b) {
		if(b == 0) return a;
		else return gcd(b, a%b);
	}
}
