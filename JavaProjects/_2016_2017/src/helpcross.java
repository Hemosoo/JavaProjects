import java.util.*;
import java.io.*;
public class helpcross {
	static int c, n;
	static pair[] ctime;
	static PrintWriter out;
	static PriorityQueue<Integer> q;
	static int ans = 0;
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
	public static void main(String[] args) throws IOException {
		out = new PrintWriter(new File("helpcross.out"));
		
		init();
		solve();
		out.close();
	}
	public static void init() throws IOException {
		FastReader s = new FastReader();
		c = s.nextInt();
		n = s.nextInt();
		ctime = new pair[n + c];
		for(int i = 0; i < c; i++) {
			int j = s.nextInt();
			ctime[i] = new pair(j, j, 0);
		}
			
		for(int i = c; i < n+c; i++) {
			ctime[i] = new pair(s.nextInt(), s.nextInt(), 1);
		}
		Arrays.sort(ctime);
		//System.out.println(Arrays.toString(ctime));
	}
	public static void solve() {
		q = new PriorityQueue<Integer>();
		for(int i = 0; i < c+n; i++) {
			if(!q.isEmpty()) {
				if(q.peek() < ctime[i].a) {
					q.poll();
				}
			}
			if(ctime[i].c == 1) {
				q.add(ctime[i].b);
				
			} else if(!q.isEmpty()) {
				q.poll();
				ans++;
			}
		}
		out.println(ans);
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
