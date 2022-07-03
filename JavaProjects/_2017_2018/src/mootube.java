import java.io.*;
import java.util.*;


public class mootube {
	static FastReader s;
	static PrintWriter out;
	static int N, Q, ans;
	static LinkedList<Edge>[] a;
	static boolean v[];
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("mootube.in"));
			
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
		out = new PrintWriter(new BufferedWriter(new FileWriter("mootube.out")));
		init();
		solve();
		out.close();
	} 
	public static void init() {
		ans = 0;
		N = s.nextInt();
		Q = s.nextInt();
		a = new LinkedList[N];
		for(int i = 0; i < N; i++) {
			a[i] = new LinkedList<Edge>();
		}
		for(int i = 0; i < N-1; i++) {
			int x = s.nextInt()-1;
			int y = s.nextInt()-1;
			int r = s.nextInt();
			a[x].add(new Edge(y, r));
			a[y].add(new Edge(x, r));
		}
		for(int i = 0; i < N; i++) {
			System.out.println(a[i]);
		}
	}
	public static void solve() {
		for(int i = 0; i < Q; i++) {
			int k = s.nextInt();
			int st = s.nextInt()-1;
			ans = 0;
			v = new boolean[N];
			dfs(st, k);
			out.println(ans);
		}
	}
	public static void dfs(int st, int k) {
		v[st] = true;
		for(Edge e: a[st]) {
			if(v[e.d] || e.w < k) continue;
			ans++;
			dfs(e.d, k);
		}
	}
	public static class Edge {
		int d, w;
		public Edge(int a, int b) {
			d = a;
			w = b;
		}
		public String toString() {
			return d + " " + w;
		}
	}
}
