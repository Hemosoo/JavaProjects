import java.util.*;
import java.io.*;
public class lifeguards {
	static BufferedReader br;
	static PrintWriter out;
	static pair[] pairs;
	static int N;
	static TreeSet<Integer> pool;
	public static void main(String[] args) throws Exception {
		br = new BufferedReader(new FileReader("lifeguards.in"));
		out = new PrintWriter(new File("lifeguards.out"));
		init();
		solve();
		br.close();
		out.close();
		
	}
	public static void init() throws Exception, IOException {
		N = Integer.parseInt(br.readLine());
		pairs = new pair[N*2];
		pool = new TreeSet<Integer>();
		StringTokenizer st;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			pairs[i*2] = new pair(i, Integer.parseInt(st.nextToken()));
			pairs[i*2+1] = new pair(i, Integer.parseInt(st.nextToken()));
		}
		Arrays.sort(pairs);
		/*for(int i = 0; i < N*2; i++) {
			System.out.println(pair.toString(pairs[i]));
		}*/
		
		
	}
	public static void solve() {
		int cur = 0;
		int ID = 0;
		int total = 0;
		int past = 0;
		int[] alone = new int[N];
		for(int i = 0; i < N*2; i++) {
			cur = pairs[i].y;
			ID = pairs[i].x;
			if(!pool.isEmpty()) {
				total += cur-past;
			}
			if(pool.size() == 1) {
				alone[pool.first()] += cur-past;
			}
			if(pool.contains(ID)) {
				pool.remove(ID);
			}
			else {
				pool.add(ID);
			}
			past = cur;
			
		}
		int ans = 0;
		for(int i: alone) {
			ans = Math.max(ans, total - i);
		}
		out.println(ans);
		//System.out.println(Arrays.toString(alone));
	}
	public static class pair implements Comparable<pair> {
		int x, y;
		pair(int a, int b) {
			this.x = a;
			this.y = b;
		}
		public int compareTo(pair p) {
			return this.y - p.y;
		}
		public static String toString(pair p) {
			return p.x + " " + p.y;
		}
	}
}
