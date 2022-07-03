import java.util.*;
import java.io.*;
public class yearofcow {
	static int N, K;
	static FastReader s;
	static int[] cows, dif, sDif;
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
		N = s.nextInt();
		K = s.nextInt();
		cows = new int[N];
		dif = new int[N-1];
		for(int i = 0; i < N; i++) {
			cows[i] = s.nextInt();
		}
		Arrays.sort(cows);
		for(int i = 1; i < N; i++) {
			dif[i-1] = cows[i] - cows[i-1];
		}
		sDif = dif.clone();
		Arrays.sort(sDif);
		//System.out.println(Arrays.toString(dif));
	}
	public static void solve() {
		int min = 1;
		int ans = 0;
		if(cows[0] > 12) K--;
		int max = (cows[cows.length-1]/12 + 1) - cows[0]/12;
		for(int i = 0; i < K; i++) {
			max -= sDif[sDif.length-1-i]/12;
		}
		//System.out.println(max);
		System.out.println(max*12);
		int mid = 0;
		while(min <= max) {
			mid = (min+max)/2;
			if(check(mid)) {
				ans = mid;
				max = mid-1;
				
			}
			else {
				min = mid+1;
			}
		}
		//System.out.println(ans);
	}
	public static boolean check(int n) {
		for(int i = 0; i < K-1; i++) {
			
		}
		return true;
	}
}
