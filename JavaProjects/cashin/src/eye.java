import java.io.*;
import java.util.*;

public class eye {
	static FastReader s;
	static String str;
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
		str = s.next();
		if(str.length()%2 == 1) {
			System.out.println("fix");
		} else {
			char c1 = str.charAt(str.length()/2);
			char c2 = str.charAt(str.length()/2-1);
			if(c1 == ')' && c2 == '(')
				System.out.println("correct");
			else
				System.out.println("fix");
		}
	}
}
