import java.util.*;
import java.io.*;
public class moobuzz2 {
	static PrintWriter out;
	static FastReader s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("moobuzz.in"));
			
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
		out = new PrintWriter(new File("moobuzz.out"));
		solve();
		out.close();
	}
	public static void solve() {
		int[] a = {1, 2, 4, 7, 8, 11, 13, 14};
		int n = s.nextInt();
		if(n%8 == 0) {
			out.print(((n/8)*15)-1);
		}
		else {
			out.print(a[(n%8)-1] + (n/8)*15);
		}
	}
}
