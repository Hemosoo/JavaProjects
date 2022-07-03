import java.util.*;
import java.io.*;
public class highcard {
	static FastReader s;
	static PrintWriter out;
	static int n;
	static ArrayList<Integer> a, b;
	static boolean e[];
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("highcard.in"));
			
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
	public static void main(String[] args) throws IOException{
		s = new FastReader();
		out = new PrintWriter(new File("highcard.out"));
		init();
		solve();
		out.close();
	}
	public static void init() {
		n = s.nextInt();
		a = new ArrayList<Integer>();
		b = new ArrayList<Integer>();
		e = new boolean[n*2 + 1];
		for(int i = 0; i < n; i++) {
			e[s.nextInt()] = true;
		}
		for(int i = 1; i < 2*n + 1; i++) {
			if(e[i]) {
				a.add(i);
			} else {
				b.add(i);
			}
		}
		//System.out.println(a);
		//System.out.println(b);
		Collections.sort(a);
		Collections.sort(b);
	}
	public static void solve() {
		int a1 = 0;
		int b1 = 0;
		int ans = 0;
		while(a1 < n && b1 < n) {
			if(b.get(b1) > a.get(a1)) {
				ans++;
				a1++;
				b1++;
			} else {
				b1++;
			}
		}
		out.println(ans);
	}
}
