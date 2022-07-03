import java.util.*;
import java.io.*;
public class evenodd {
	static int n, o, e;
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
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		
		init();
		solve();
	}
	public static void init() {
		n = s.nextInt();
		for(int i = 0; i < n; i++) {
			int temp = s.nextInt();
			if(temp%2 ==0) e++;
			else o++;
		}
	}
	public static void solve() {
		if(o > e) {
			int t = (int)(Math.ceil((o-e)/3.0));
			o-=t*2;
			e+=t;
			
		}
		int ans = 0;
		if(o==e) ans = o+e;
		if(o<e) ans = o*2 + 1;
		System.out.println(ans);
	}
}
/*
 * int t = (int)(Math.ceil((o-e)/3.0));
			o-=t*2;
			e+=t;
			*/
