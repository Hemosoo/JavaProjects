import java.util.*;
import java.io.*;
public class Dijkstra_template2 {
	static Scanner in;
	static int n, d[], m, s, INF=100000000;
	static boolean v[];
	static ArrayList<pair> a[];
	public static void main(String[]args) {
		in = new Scanner(System.in);
		init();
	}
	public static void init() {
		n = in.nextInt();
		m = in.nextInt();
		a = new ArrayList[n];
		d = new int[n];
		v = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<pair>();
		}
		for(int i = 0; i < m; i++) {
			int x = in.nextInt()-1;
			int y = in.nextInt()-1;
			int w = in.nextInt();
			a[x].add(new pair(y, w));
			a[y].add(new pair(x, w));
		}
		
		dijkstra();
		System.out.println(Arrays.toString(d));
	}
	static void dijkstra() {
		
		PriorityQueue<pair> pq = new PriorityQueue<pair>();
		d[s] = 0;
		pq.add(new pair(s, 0));
		
		while(!pq.isEmpty()) {
			
			int cur = pq.peek().n;
			int dis = pq.peek().w;
			if(v[cur]) continue;
			v[cur] = true;
			
			for(pair next:a[cur]) {
				if(v[next.n]) continue;
				if(dis + next.w<d[next.n]) {
					d[next.n] = dis + next.w;
					pq.add(new pair(next.n, dis + next.w));
				}
			}
		}
	}
	static class pair implements Comparable<pair> {
		
		int n, w;
		pair(int n, int w) {
			this.n = n;
			this.w = w;
		}
		@Override
		public int compareTo(pair o) {
			return this.w = o.w;
		}
		public String toString() {
			return n + " " + w;
		}
	}
}
