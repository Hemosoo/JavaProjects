import java.util.*;
import java.io.*;
public class reststops {
	static PrintWriter out;
	static FastReader s;
	static int l, n, rf, rb;
	static pair[] stops;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("reststops.in"));
			
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
		s=new FastReader();
		out = new PrintWriter(new File("reststops.out"));
		init();
		solve();
		out.close();
	}
	public static void init() {
		l = s.nextInt();
		n = s.nextInt();
		rf = s.nextInt();
		rb = s.nextInt();
		stops = new pair[n];
		for(int i = 0; i < n; i++) {
			stops[i] = new pair(s.nextInt(), s.nextInt());
		}
		Arrays.sort(stops);
		
	}
	public static void solve() {
		long bef = 0;
		long ans = 0;
		long time = 0;
		for(int i = stops.length-1; i >= 0; i--) {
			if(stops[i].a <= bef) {
				continue;
			}
			time = stops[i].a-bef;
			bef = stops[i].a;
			ans += stops[i].b * (time * rf - time*rb);
		}
		out.println(ans);
	}
	static class pair implements Comparable<pair> {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		public int compareTo(pair o) {
			// TODO Auto-generated method stub
			return b - o.b;
		}
		public String toString() {
			return a + " " + b;
		}
		
	}
}
