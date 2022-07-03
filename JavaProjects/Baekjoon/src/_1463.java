import java.io.*;
import java.util.*;

public class _1463 {
	static int n, d[];
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		FastReader s = new FastReader();
		n = s.nextInt();
		int[] d = new int[n+1];
		d[1] = 0;
		for(int i = 2; i <=n; i++) {
			d[i] = d[i-1] + 1;
			if(i%2 == 0 && d[i] > d[i/2] + 1) {
				d[i] = d[i/2] + 1;
			}
			if(i%3 == 0 && d[i] > d[i/3] + 1) {
				d[i] = d[i/3] + 1;
			}
		}
		System.out.println(d[n]);
	}
}
