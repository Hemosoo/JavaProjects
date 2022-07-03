import java.util.*;
import java.io.*;
public class visits {
	static FastReader s;
	static ArrayList<String> p;
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
		s = new FastReader();
		init();
		solve();
	}
	public static void init() {
		
	}
	public static void solve() {
		
	}
static void per(String left, String right) {
		
		if(left.length() == 0) {
			p.add(right);
			return;
		}
		for(int i = 0; i < left.length(); i++) {
			char c = left.charAt(i);
			String l = left.substring(0, i)+left.substring(i+1);
			String r = right + c;
			per(l, r);
		}
	}
}
