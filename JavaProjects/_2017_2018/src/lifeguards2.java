import java.util.*;
import java.io.*;
public class lifeguards2 {
	static int n, alone[], ans;
	static triple a[];
	static FastReader s;
	static PrintWriter out;
	static HashSet<Integer> pool;
	static class FastReader {
		BufferedReader in;
		StringTokenizer st;
		public FastReader() throws IOException {
			in = new BufferedReader(new FileReader("lifeguards.in"));
			
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
		long nextLong() {
			return Long.parseLong(next());
		}
	}
	public static void main(String[] args) throws IOException {
		s = new FastReader();
		out = new PrintWriter(new File("lifeguards.out"));
		
		init();
		solve();
		out.close();
	}
static void init() throws IOException {
		
		n = s.nextInt();
		
		a = new triple[n*2];
		for(int i=0; i<n; i++) {

			a[i*2] = new triple(i, s.nextInt(), 1);
			a[i*2+1] = new triple(i, s.nextInt(), -1);

		}
			
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		pool = new HashSet<Integer>();
		alone = new int[n];
	}
	
	static void solve() {
		
		int total = 0;
		int cur = 0;
		int pre = 0;
		
		for(triple d:a) {
			int id = d.id;
			cur = d.time;
			int s = d.status;
			
			if(pool.size()>0) {
				total += cur-pre;
			}
			
			if(pool.size()==1) {
				alone[pool.hashCode()]+=cur-pre;
			}
			
			if(s==1) {
				pool.add(id);
			}
			else pool.remove(id);
			
			pre = cur;
		}
		
//		System.out.println(total);
//		System.out.println(Arrays.toString(alone));
		
		Arrays.sort(alone);
		
		out.println(total - alone[0]);
	}	
	
	static class triple implements Comparable<triple>{

		int id, time, status;
		triple(int i, int t, int s){
			id = i;
			time = t; 
			status = s;
		}
		@Override
		public int compareTo(triple o) {
			
			return this.time-o.time;
		}
		
		public String toString() {
			return id+" "+time+" "+status;
		}
	}
}