import java.util.*;

import java.io.*;
public class codequest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int n1 = in.nextInt();
			pair[] a = new pair[n1];
			for(int j = 0; j < n1; j++) {
				a[j] = new pair(in.nextInt(), in.nextInt());
			}
			Arrays.sort(a);
			for(pair p: a) {
				System.out.println(p.toString());
			}
		}
	}
	public static class pair implements Comparable<pair> {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		public int compareTo(pair p) {
			if(Math.sqrt(a*a + b*b) > Math.sqrt(p.a*p.a + p.b*p.b)) {
				return 1;
			} else {
				return -1;
			}
			//return  (int) (Math.sqrt(a*a + b*b) - Math.sqrt(p.a*p.a + p.b*p.b));
		}
		public String toString() {
			return a + " " + b;
		}
	}
}
