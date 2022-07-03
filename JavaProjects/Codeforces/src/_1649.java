import java.io.*;
import java.util.*;
public class _1649 {
	static int n, q;
	static long a[][];
	static BufferedReader in;
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
		in.close();
	}
	public static void init() throws IOException {
		st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		a = new long[20][n];
		st = new StringTokenizer(in.readLine());
		
		for(int i = 0; i < n; i++) a[0][i] = Long.parseLong(st.nextToken());
	}
	public static void solve() throws IOException {
		int x = 1;
		StringBuilder sb = new StringBuilder();
		
		while(1<<x <= n) {
			int d = 1<<x;
			for(int i = 0;i < n-d+1; i++) {
				a[x][i] = Math.min(a[x-1][i], a[x-1][i+d/2]);
				
				
			}
			x++;
		}
		//System.out.println(Arrays.deepToString(a));
		while(q-->0) {
			st = new StringTokenizer(in.readLine());
			int u = Integer.parseInt(st.nextToken())-1;
			int v = Integer.parseInt(st.nextToken())-1;
			int k = log2(v-u+1);
			x = 1<<k;
			sb.append(Math.min(a[k][u], a[k][v-x+1])).append("\n");
		}
		System.out.println(sb.toString());
	}
	public static int log2(int N) {
		int result = (int)(Math.log(N) / Math.log(2));
		return result;
	}
}
