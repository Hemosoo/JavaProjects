import java.util.*;
import java.io.*;
public class distinctnumbers {
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
		TreeSet<Integer> a = new TreeSet<Integer>();
		s = new FastReader();
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			a.add(s.nextInt());
		}
		System.out.println(a.size());
	}
}
