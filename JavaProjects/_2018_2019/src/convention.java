import java.io.*;
import java.util.*;
public class convention {
	static PrintWriter out;
	static int n, m, c, a[], ans;
	static FastReader s;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("convention.in"));
			
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
		out = new PrintWriter(new File("convention.out"));
		
		init();
		out.close();
	}
	public static void init() {
		n = s.nextInt();
		m = s.nextInt();
		c = s.nextInt();
		a = new int[n];
		
		for(int i = 0; i < n; i++) a[i] = s.nextInt();
		
		Arrays.sort(a);
		
		int low = 0, up = a[n-2]*2, mid = 0;
		
		while(low <= up) {
			mid = (up+low)/2;
			if(f(mid)) {
				ans = mid;
				up = mid-1;
			}
			else low = mid+1;
		}
		out.println(ans);
	}
	public static boolean f(int mid) {
		int s = 0, start = a[0], bus = 1, cow = 0;
		for(int i = 0; i < n; i++) {
			s = a[i]-start;
			cow++;
			if(cow > c || s > mid) {start = a[i]; bus++; cow=1;}
			
		}
		return bus <= m;
	}
}