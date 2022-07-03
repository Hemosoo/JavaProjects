import java.io.*;
import java.util.*;
public class cown {
	static BufferedReader in;
	static int N, origin, ans;
	static boolean visited[];
	static String result;
	static Queue<Integer> q;
	static ArrayList<Integer>[] a;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
		in.close();
	}
	public static void init() throws IOException {
		N = Integer.parseInt(in.readLine());
		q = new LinkedList<Integer>();
		visited = new boolean[N];
		a = new ArrayList[N];
		for(int i = 0; i < N; i++) {
			a[i] = new ArrayList<Integer>();
		}
		StringTokenizer st;
		for(int i = 0; i < N-1; i++) {
			st = new StringTokenizer(in.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			a[x].add(y);
		}
		System.out.println(Arrays.toString(a));
		
		ans = N-1;
	}
	public static void solve() {
		//bfs(0);
		//System.out.println(result);
		
		for(ArrayList<Integer> i:a) {
			int s = i.size();
			origin = 1;
			if(s > 0) {
				while(origin < s+1) {
					origin*=2;
					ans++;
				}
			}
		}
		System.out.println(ans);
	}
	static void bfs(int s) {
		visited[s] = true;
		result = "";
		q.add(s);
		while(!q.isEmpty()) {
			int n = q.poll();
			result+=(n+1) + " ";
			for(int i:a[n]) {
				if(!visited[i]) {
					q.add(i);
					visited[i] = true;
					ans++;
				}
			}
		}
	}
}
/*
6
1 2
1 3
2 4
2 5
3 6 
 */
