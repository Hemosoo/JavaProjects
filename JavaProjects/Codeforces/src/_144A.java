import java.util.*;

import java.io.*;
public class _144A {
	static FastReader s;
	static int n;
	static int[] nums;
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
		n = s.nextInt();
		nums = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = s.nextInt();
		}
	}
	public static void solve() {
		int[] c = nums.clone();
		Arrays.sort(c);
		int min = c[0];
		int max = c[c.length-1];
		
		int minI = 0;
		int maxI = 0;
		
		
		for(int i = 0; i < nums.length; i++) {
			if(min == nums[i]) {
				
			}
		}
	}
}
