import java.util.*;
import java.io.*;
public class moobuzz {
	static long n;
	static BufferedReader in;
	static PrintWriter out;
	public static void main(String[] args) throws IOException {
		in = new BufferedReader(new FileReader("moobuzz.in"));
		out = new PrintWriter(new File("moobuzz.out"));
		init();
		solve();
		in.close();
		out.close();
	}
	public static void init() throws NumberFormatException, IOException {
		n = Integer.parseInt(in.readLine());
	}
	public static void solve() {
		long ans = 0;
		long mult = n/8;
		long rem = n%8;
		if(rem == 0) {
			ans--;
		}
		ans += mult*15;
		switch((int)(rem)) {
			case 1: 
				ans += 1;
				break;
			case 2: 
				ans += 2;
				break;
			case 3: 
				ans += 4;
				break;
			case 4: 
				ans += 7;
				break;
			case 5: 
				ans += 8;
				break;
			case 6: 
				ans += 11;
				break;
			case 7: 
				ans += 13;
				break;
			case 8: 
				ans += 14;
				break;
		}
		out.println(ans);
	}
}
