import java.util.*;
import java.io.*;
public class prob21 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n; i++) {
			ArrayList<String> arr = new ArrayList<String>();
			String[] s = in.nextLine().split(" - ");
			//System.out.println(Arrays.toString(s));
			char[] c = s[0].toCharArray();
			for(char c1: c) {
				arr.add(c1+"");
			}
			for(int j = 0; j < s[1].length(); j++) {
				for(int k = j; k < s[1].length()+1; k++) {
					String temp = s[1].substring(j, k);
				}
			}
		}
	}
}
/*
2
hayneedle - a needle lost in a haystack
clockneedle - a needle lost in a haystack

*/