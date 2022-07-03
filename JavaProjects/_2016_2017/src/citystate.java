import java.util.*;
import java.io.*;
public class citystate {
	static BufferedReader in;
	static PrintWriter out;
	static int N;
	static TreeMap<String, Integer> a, b;
	public static void main(String[] args) throws Exception {
		in = new BufferedReader(new FileReader("citystate.in"));
		out = new PrintWriter(new File("citystate.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() throws Exception, IOException {
		a = new TreeMap<String, Integer>();
		b = new TreeMap<String, Integer>();
		N = Integer.parseInt(in.readLine());
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			String ab = st.nextToken().substring(0, 2);
			if(a.containsKey(ab)) {
				a.replace(ab, a.get(ab)+1);
			} else {
				a.put(ab, 1);
			}
			ab = st.nextToken();
			if(b.containsKey(ab)) {
				b.replace(ab, b.get(ab)+1);
				
			} else {
				b.put(ab, 1);
			}
		}
		//System.out.println(a);
		//System.out.println(b);
		
	}
	public static void solve() {
		a.values();
	}
}
