import java.util.*;

import java.io.*;
public class mooves {
	static int n, k, nums[], or[], ans[];
	static ArrayList<Integer>[] a;
	static FastReader s;
	static pair[] sw;
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
		n = s.nextInt();
		k = s.nextInt();
		a = new ArrayList[n];
		sw = new pair[k];
		ans = new int[n];
		nums = new int[n];
		or = new int[n];
		for(int i = 0; i < n; i++) {
			nums[i] = i;
			a[i] = new ArrayList<Integer>();
			a[i].add(nums[i]);
		}
		
		
	}
	public static void solve() {
		//while(!same) {
			
		for(int i = 0; i < k; i++) {
				int x = s.nextInt()-1;
				int y = s.nextInt()-1;
				
				//a[nums[y]].add(y);
				//a[nums[x]].add(x);
				a[nums[x]].add(y);
				a[nums[y]].add(x);
				int temp = nums[y];
				nums[y] = nums[x];
				nums[x] = temp;
				
		}
			//System.out.println(Arrays.toString(a));
		//}
		ArrayList<Integer> cycle = new ArrayList<Integer>();
		int[] ans = new int[n];
		HashSet<Integer> temp = new HashSet<Integer>();
		boolean[] v = new boolean[n];
		for(int i = 0; i < n; i++) {
			if(v[i]) continue;
			int p = i;
			while(!v[p]) {
				v[p] = true;
				cycle.add(p);
				p = nums[p];
				
			}
			//System.out.println(cycle);
			for(int o:cycle) {
				temp.addAll(a[o]);
			}
			for(int o:cycle) {
				ans[o] = temp.size();
			}
			temp = new HashSet<Integer>();
			cycle = new ArrayList<Integer>();
		}
		StringBuilder s = new StringBuilder();
		for(int i = 0; i < n; i++) {
			s.append(ans[i]).append("\n");
		}
		System.out.print(s.toString());
	}
	public static class pair  {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}

		public String toString() {
			return a + " " + b;
		}
	}
}
