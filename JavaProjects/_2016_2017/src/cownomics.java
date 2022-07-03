import java.io.*;
import java.util.*;

public class cownomics {
	static int n, m;
	static String[] reg, spot;
	static FastReader s;
	static PrintWriter out;
	static int count;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("cownomics.in"));
			
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
		out = new PrintWriter(new File("cownomics.out"));
		init();
		solve();
		out.close();
}
	public static void init() {
		n = s.nextInt();
		m = s.nextInt();
		reg = new String[n];
		spot = new String[n];
		for(int i = 0; i < n; i++) {
			spot[i] = s.next();
		}
		for(int i = 0; i < n; i++) {
			reg[i] = s.next();
		}
		//System.out.println(Arrays.toString(spot));
	}
	public static void solve() {
		count= 0;
		for(int i = 0; i < m; i++) {
			for(int j = i+1; j < m; j++) {
				for(int k = j+1; k < m; k++) {
					check(i, j, k);
				}
			}
		}
		out.println(count);
	}
	public static void check(int a, int b, int c) {
		HashSet<String> set = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			set.add("" + spot[i].charAt(a) + spot[i].charAt(b) + spot[i].charAt(c));
		}
		//System.out.println(set);
		HashSet<String> set2 = new HashSet<String>();
		for(int i = 0; i < n; i++) {
			set2.add("" + reg[i].charAt(a) + reg[i].charAt(b) + reg[i].charAt(c));
		}
		//System.out.println(set2);
		boolean ans = true;
		for(String s:set) {
			if(!ans) break;
			for(String s2:set2) {
				if(s2.equals(s)) {
					ans = false;
					break;
				}
			}
		}
		if(ans) count++;
	}
}
