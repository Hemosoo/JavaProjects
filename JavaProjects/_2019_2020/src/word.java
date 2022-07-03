import java.util.*;
import java.io.*;
public class word {
	static Scanner in;
	static PrintWriter out;
	static int N, K, length, hold;
	static String[] s;
	public static void main(String[] args) throws IOException {
		in = new Scanner(new File("word.in"));
		out = new PrintWriter(new File("word.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() {
		N = in.nextInt();
		K = in.nextInt();
		s = new String[N];
		hold = 0;
		length = 0;
		for(int i = 0; i < N; i++) {
			s[i] = in.next();
		}
	}
	public static void solve() {
		out.print(s[0]);
		hold += s[0].length();
		for(int i = 1; i < N; i++) {
			hold += s[i].length();
			if(hold <= K) {
				out.print(" " + s[i]);
			} else {
				out.print("\n" + s[i]);
				hold = s[i].length();
			}
		}
	}
}