import java.util.*;
import java.io.*;
public class A {
	static int r, b, d, n;
	static FastReader s;
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
	public static void main(String[] args) throws Exception {
		s = new FastReader();
		n = s.nextInt();
		init();

	}
	public static void init() throws Exception, IOException {
		for(int i = 0; i < n; i++ ) {
			r = s.nextInt()-1;
			b = s.nextInt()-1;
			d = s.nextInt();
			solve();
		}
		
		
	}
	public static void solve() {
		int temp = (r + b)/2;
			if(temp <= d) {
				System.out.println("yes");
			} else {
				if(Math.abs(r-b) <= d) {
					System.out.println("yes");
				}
				else {
					System.out.println("no");
				}

			}
		
	}
}

