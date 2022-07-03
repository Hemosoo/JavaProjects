import java.util.*;
import java.io.*;
public class pairexample {
	public static void main(String[] args) {
		pair[] a = new pair[5];
		for(int i = 0; i < 5; i++) {
			a[i] = new pair(1, 1);
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static class pair implements Comparable<pair> {
		int a, b;
		public pair(int x, int y) {
			a = x;
			b = y;
		}
		public int compareTo(pair p) {
			
			return a - p.a;
		}
		public String toString() {
			return a + " " + b;
		}
	}
}
