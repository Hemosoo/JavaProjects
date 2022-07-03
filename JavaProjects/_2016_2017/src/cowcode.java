import java.io.*;
import java.util.*;
public class cowcode {
	static PrintWriter out;
	static FastReader s;
	static long n;
	static String cow;
	static ArrayList<Long> a;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("cowcode.in"));
			
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		out = new PrintWriter(new File("cowcode.out"));
		init();
		solve();
		out.close();
	}
	public static void init() {
		cow = s.next();
		n = s.nextInt();
		a = new ArrayList<Long>();
	}
	public static void solve() {
		int len = cow.length();
		long index = len;
		a.add(index);
		while(index * 2 <=n) {
			index*=2;
			a.add(index);
		}
		Collections.reverse(a);
		while(n > len) {
			if(n == a.get(0) ) {
				n--;
			}
			else if(n > a.get(0)) {
				n-=a.get(0)-1;
			}
			a.remove(0);
		}
		System.out.println(cow.charAt((int)n-1));
	}
}
