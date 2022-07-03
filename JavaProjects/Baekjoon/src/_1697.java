import java.io.*;
import java.util.*;
public class _1697 {
	static int n, k;
	static BufferedReader in;
	static boolean visited[];
	static Queue<Integer> a;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
	}
	public static void init() throws IOException {
		StringTokenizer st = new StringTokenizer(in.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		visited = new boolean[100001];
		a = new LinkedList<Integer>();
	}
	public static void solve() {
		a.offer(n);
		visited[n] = true;
		int ans = 0;
		while(!a.isEmpty()) {
			int size = a.size();
			for(int i = 0; i < size; i++) {
				int num = a.poll();
				if (num == k) {
					System.out.println(ans);
					break;
				}
				if (num - 1 >= 0 && !visited[num - 1]) {
					a.offer(num - 1);
					visited[num - 1] = true;
				}
				if (num + 1 <= 100000 && !visited[num + 1]) {
					a.offer(num + 1);
					visited[num + 1] = true;
				}
				if (num * 2 <= 100000 && !visited[num * 2]) {
					a.offer(num * 2);
					visited[num * 2] = true;
				}
			
			
			}
			ans++;
		}
	}

}
