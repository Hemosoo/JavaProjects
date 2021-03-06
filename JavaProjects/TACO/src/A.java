import java.util.*;

import java.io.*;
public class A {
	static FastReader s;
	static int t, n;
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
		
	}
	public static void init() {
		t = s.nextInt();
		for(int i = 0; i < t; i++) {
			solve();
		}
	}
	public static void solve() {
		n = s.nextInt();
		String s1 = s.next();
		if(n==2) System.out.println(2);
		else {
			int cnt = 1;
			
				char c = s1.charAt(n/2);
				int i1 = 0;
				int i2 = 0;
				if(n%2==1) {
					i1 = n/2 - 1;
					i2 = n/2 + 1;
				} else {
					i1 = n/2 - 1;
					i2 = n/2;
					cnt--;
				}
				
				while(i1 != 0 && i2 != n-1) {
					if(s1.charAt(i1) == c) {
						
						cnt++;
					}
					if(s1.charAt(i2) == c) {
						cnt++;
						
					}
					if(s1.charAt(i1) != c && s1.charAt(i2) != c) break;
					i1 -=1;
					i2 +=1;
				}
				if(i1 == 0 && i2 == n-1) {
					if(s1.charAt(0) == c) cnt++;
					if(s1.charAt(n-1) == c) cnt++;
				}
			System.out.println(cnt);
			
		}
	}
}
