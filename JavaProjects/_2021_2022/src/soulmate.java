import java.io.*;
import java.util.*;

public class soulmate {
	static long p1;
	static long p2;
	static int nums[], N, max;
	static String str;
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
		N = s.nextInt();
		for(int i = 0; i < N; i++) {
			init();
		}
	}
	public static void init() {
		
		p1 = s.nextLong();
		p2 = s.nextLong();
		System.out.println(alg(p1, p2));
		
	}
	public static long alg(long a, long b) {
		if(a==b) return 0;
		if(a>b) {
			long odd = (a%2);
			return 1+odd+alg((a+odd)/2, b);
		}
		else {
			long odd = b%2;
			return Math.min(1+odd+alg(a, (b-odd)/2), b-a);
		}
	}
		
		
	
	
}
