import java.util.*;

import java.io.*;
public class justGreenEnough {
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
		
	}
	public static void solve() {
		
	}
}
