import java.io.*;
import java.util.*;

public class bcount {
	static FastReader s;
	static int N, Q;
	static PrintWriter out;
	static trip[] a;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("bcount.in"));
			
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
		out = new PrintWriter(new File("bcount.out"));
		s = new FastReader();
		init();
		solve();
		out.close();
	}
	public static void init() {
		N = s.nextInt();
		Q = s.nextInt();
		a = new trip[N+1];
		a[0] = new trip(0, 0, 0);
		for(int i = 1; i < N+1; i++) {
			a[i] = new trip(0, 0, 0);
			int t = s.nextInt();
			if(t == 1) {
				a[i].a +=1;
			} else if(t == 2) {
				a[i].b +=1;
			} else {
				a[i].c +=1;
			}
			a[i].a += a[i-1].a;
			a[i].b += a[i-1].b;
			a[i].c += a[i-1].c;
		}
		//System.out.println(Arrays.toString(a));
	}
	public static void solve() {
		for(int i = 0; i < Q; i++) {
			int n1 = s.nextInt()-1;
			int n2 = s.nextInt();
			trip ans = new trip(a[n2].a-a[n1].a, a[n2].b-a[n1].b, a[n2].c-a[n1].c);
			out.println(ans);
		}
	}
	public static class trip {
		int a, b, c;
		public trip(int x, int y, int z) {
			a = x;
			b = y;
			c = z;
		}
		public String toString() {
			return a + " " + b + " " + c;
		}
	}
}
