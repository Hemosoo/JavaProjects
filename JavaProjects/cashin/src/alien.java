import java.io.*;
import java.util.*;

public class alien {
	static FastReader s;
	static long N, check[], p, m;
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
		N = s.nextLong();
		check = new long[10];
		String s = N+"";
		for(int i = 0; i < s.length(); i++) {
			check[Character.getNumericValue(s.charAt(i))]++;
		}
		boolean imp = true;
		for(long i:check) {
			if(i == 0) {
				imp = false;
			}
		}
		if(imp) {
			System.out.println("Impossible");
		}
		else {
			solve();
		}
	}
	public static void solve() {
		p = N;
		m = N;
		
		boolean found =  false;
		while(!found) {
			
		}
	}
}
