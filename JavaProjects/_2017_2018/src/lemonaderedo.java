import java.util.*;
import java.io.*;
public class lemonaderedo {
	static PrintWriter out;
	static int n;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("lemonade.in"));
			
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
		out = new PrintWriter(new File("lemonade.out"));
		init();
		solve();
		out.close();
	}
	public static void init(){
		
	}
	public static void solve() {
		
	}
 }

