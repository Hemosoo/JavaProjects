import java.io.*;
import java.util.*;
public class countto10 {
	static Scanner in;
	static int n;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		init();
		solve();
	}
	public static void init() {
		n = in.nextInt();
	}
	public static void solve() {
		for(int i = 0; i < n; i++) {
			int c = in.nextInt();
			for(int j = 0; j < Math.pow(2, c); j++) {
				String bin = Integer.toBinaryString(j);
				while(bin.length() < c) {
					bin = "0" + bin;
				}
				System.out.println(bin);
			}
		}
	}
}
