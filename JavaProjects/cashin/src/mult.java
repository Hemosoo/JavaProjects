import java.io.*;
import java.util.*;

public class mult {
	static FastReader s;
	static int N, in;
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
		s = new FastReader();
		N = s.nextInt();
		in = s.nextInt();
		for(int i = 1; i < N; i++) {
			int t = s.nextInt();
			if(t%in == 0) {
				System.out.println(t);
				in = s.nextInt();
				i++;
			}
		}
	}
}

