import java.util.*;
import java.io.*;
public class cowdance {
	static int N, tmax, nums[];
	static FastReader s;
	static PrintWriter out;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("cowdance.in"));
			
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
		out = new PrintWriter(new File("cowdance.out"));
		init();
		solve();
		out.close();
	}
	public static void init() {
		N = s.nextInt();
		tmax = s.nextInt();
		nums = new int[N];
		for(int i = 0; i < N; i++) {
			nums[i] = s.nextInt();
		}
		//System.out.println(Arrays.toString(nums));
		//System.out.println(N + " " + tmax);
	}
	public static void solve() {
		int max = N;
		int min = 1;
		int ans = 0;
		int mid = 0;
		while(min <= max) {
			mid = (min+max)/2;
			if(check(mid)) {
				ans = mid;
				max = mid-1;
			}else {
				min = mid + 1;
			}
		}
		out.println(ans);
	}
	public static boolean check(int m) {
		PriorityQueue<Integer> stage = new PriorityQueue<Integer>();
		
		for(int i = 0; i < m; i++) stage.add(nums[i]);
		
		for(int i = m; i < N; i++) {
			if(stage.peek() + nums[i] > tmax) return false;
			stage.add(nums[i]+stage.poll());
		}
		return true;
	}
}
