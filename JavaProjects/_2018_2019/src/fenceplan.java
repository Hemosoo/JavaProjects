import java.util.*;
import java.io.*;
public class fenceplan {
	static ArrayList<Integer>[] a;
	static pair[] coord;
	static int n, m, ans;
	static int x1, x2, y1, y2;
	static boolean[] visited;
	static PrintWriter out;
	static FastReader s;
	static ArrayList<Integer> answers;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("fenceplan.in"));
			
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
		out = new PrintWriter(new File("fenceplan.out"));
		init();
		solve();
		out.close();
	}
	public static void init() throws IOException {
		s = new FastReader();
		n = s.nextInt();
		m = s.nextInt();
		coord = new pair[n];
		ans = Integer.MAX_VALUE;
		a = new ArrayList[n];
		answers = new ArrayList<Integer>();
		visited = new boolean[n];
		for(int i = 0; i < n; i++) {
			coord[i] = new pair(s.nextInt(), s.nextInt());
			a[i] = new ArrayList<Integer>();
		}
		for(int i = 0; i < m; i++) {
			int x = s.nextInt()-1;
			int y = s.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}
		//System.out.println(Arrays.toString(a));
		
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			if(!visited[i]) {
				x1 = coord[i].a;
				x2 = coord[i].a;
				y1 = coord[i].b;
				y2 = coord[i].b;
				dfs(i);
				
			}
		}
		for(Integer i: answers) {
			ans = Math.min(ans, i);
		}
		out.println(ans);
	}
	static void dfs(int n) {
		visited[n] = true;
		for(int i: a[n]) {
			if(!visited[i]) {
				dfs(i);
				perimeter(i);
			}
			
		}
		perimeter(n);
	}
	static void perimeter(int n) {
		if(coord[n].a < x1)
		     x1 = coord[n].a;
		else if(coord[n].a > x2)
		     x2 = coord[n].a;
		if(coord[n].b < y1)
		     y1 = coord[n].b;
		else if(coord[n].b > y2)
		     y2 = coord[n].b;
		
		answers.add((y2-y1)*2 + (x2-x1)*2);
	}
	static class pair{
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		public String toString() {
			return a + " " + b;
		}
		
	}
}
