import java.io.*;
import java.util.*;

public class _14003 {
	static int n, d[], a[];
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
		d=new int[n];
		a=new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}
		
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			d[i] = 1;
			for(int j = 0; j < i; j++) {
				if(a[i]>a[j] && d[j]+1 > d[i]) {
					d[i] = d[j]+1;
				}
			}
			max = Math.max(d[i], max);
		}
		System.out.println(max);
	}
	
}
