import java.util.*;
public class BFS30 {
	static int n, m, s;
	static boolean[] v;
	static Queue<Integer> q;
	static Scanner in;
	static String result;
	static ArrayList<Integer>[] a;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
		in.close();
	}
	public static void init() {
		n = in.nextInt();
		m = in.nextInt();
		s = in.nextInt();
		v = new boolean[n];
		q = new LinkedList<Integer>();
		a = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			a[x].add(y);
			a[y].add(x);
		}
		System.out.println(Arrays.toString(a));
	}
	public static void solve() {
		bfs(s-1);
		System.out.println(result);
	}
	static void bfs(int s) {
		v[s] = true;
		result = "";
		q.add(s);
		while(!q.isEmpty()) {
			int n = q.poll();
			result+=(n+1) + " ";
			for(int i:a[n]) {
				if(!v[i]) {
					q.add(i);
					v[i] = true;
				}
			}
		}
	}
}
/*
8 7 1
1 2
1 3
2 6
2 7
3 4
3 5
4 8

*/