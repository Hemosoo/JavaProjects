import java.util.*;

import java.io.*;
public class restaurantCustomers {
	static FastReader s;
	static int n;
	static TreeMap<Integer, Integer> a;
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
    static void init() {
    	n = s.nextInt();
    	a = new TreeMap<Integer, Integer>();
    	for(int i = 0; i < n; i++ ) {
    		a.put(s.nextInt(), 1);
    		a.put(s.nextInt(), -1);
    	}
    }
    static void solve() {
    	int max = 0;
    	int cur = 0;
    	for(int i: a.keySet()) {
    		cur+=a.get(i);
    		max = Math.max(max, cur);
    	}
    	System.out.println(max);
    }
}

