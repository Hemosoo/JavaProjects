import java.util.*;
import java.io.*;
public class bfs_template1 {
	static Scanner in;
	static int n, m;
	static boolean[] v;
	static ArrayList[] a;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
	}
	public static void init() {
		n = in.nextInt();
		m = in.nextInt();
		int s = in.nextInt()-1;
		
		v = new boolean[n];
		a = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<Integer>();
		}
		
		for(int i = 0; i < m; i++) {
			int u = in.nextInt()-1;
			int v = in.nextInt()-1;
			a[u].add(v);
			a[v].add(u);
		}
		
		bfs(s);
	}
	static void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		
		while(!q.isEmpty()) {
			
			int x = q.remove();
			if(v[x]) continue;
			
			v[x] = true;
			System.out.println(x+1+" ");
			ArrayList<Integer> b = a[x];
			for(int y: b) if(!v[y]) q.add(y);
		}
	}
}
