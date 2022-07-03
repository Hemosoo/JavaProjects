import java.io.*;
import java.util.*;

public class frisbee {
	static int N, a[];
	static Stack<Integer> stack;
	static FastReader s;
	static long ans;
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
		init();
		solve();
		
	}
	public static void init() {
		stack = new Stack<Integer>();
		N = s.nextInt();
		a = new int[N];
		for(int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
	}
	public static void solve() {
		for(int i = 0; i < N; i++) {
			while(!stack.empty() && a[stack.peek()] < a[i]) {
				stack.pop();
			}
			if(!stack.empty()) {
				ans+= i - stack.peek()+1;
			}
			stack.push(i);
		}
		for(int i = 0; i < N/2; i++) {
			int t = a[i];
			a[i] = a[N-i-1];
			a[N-i-1] = t;
		}
		//System.out.println(Arrays.toString(a));
		for(int i = 0; i < N; i++) {
			while(!stack.empty() && a[stack.peek()] < a[i]) {
				stack.pop();
			}
			if(!stack.empty()) {
				ans+= i - stack.peek()+1;
			}
			stack.push(i);
		}
		System.out.println(ans);
	}
}
