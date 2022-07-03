import java.io.*;
import java.util.*;

import helpcross.pair;

public class badmilk {
	static int n, m, d, s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("helpcross.in"));
			
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
	public static void main(String[] args) {
		
	}
	public static void init() {
		
	}
	public static void solve() {
		
	}
	public static class pair implements Comparable<pair> {
		int a, b, c;
		public pair(int x, int y, int z) {
			a = x;
			b = y;
			c = z;
		}
		public int compareTo(pair p) {
			if(a == p.a) {
				return p.c - c;
			}
			return a - p.a;
		}
		public String toString() {
			return a + " " + b + " " + c;
		}
	}
}
