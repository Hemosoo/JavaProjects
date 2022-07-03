import java.util.*;

import pairexample.pair;
import sun.security.pkcs11.wrapper.Functions;

import java.io.*;
public class prob21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, pair> a = new HashMap<String, pair>();
		for(int i = 0; i < 4; i++) {
			a.put(in.next(), new pair(0, 0));
		}
		in.nextLine();
		for(int i = 0; i < 6; i++) {
			String[] line = in.nextLine().split(" ");
			//System.out.println(line);
			String[] score = line[1].split(":");
			int left = Integer.parseInt(score[0]);
			int right = Integer.parseInt(score[1]);
			if(left > right) {
				a.replace(line[0], new pair(a.get(line[0]).a + 3, a.get(line[0]).b));
			} else if(right > left) {
				a.replace(line[2], new pair(a.get(line[2]).a + 3, a.get(line[2]).b));
			} else {
				a.replace(line[2], new pair(a.get(line[2]).a + 1, a.get(line[2]).b));
				a.replace(line[0], new pair(a.get(line[0]).a + 1, a.get(line[0]).b));
			}
			a.replace(line[0], new pair(a.get(line[0]).a, a.get(line[0]).b + left - right));
			a.replace(line[2], new pair(a.get(line[2]).a, a.get(line[2]).b + right - left));
		
		}
		for(String s: a.keySet()) {
			String ans = "";
			ans += s + " " + a.get(s).toString();
			System.out.println(ans);
		}
		//pair = Ordering.natural().onResultOf(Functions.forMap(map))
		
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
