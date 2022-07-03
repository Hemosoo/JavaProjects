import java.util.*;
import java.io.*;
public class prob24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String b = "";
		for(int i = 0; i < s1.length(); i++) {
			int ind = s2.indexOf(s1.charAt(i))-8;
			String t = Integer.toBinaryString(ind);
			while(!(t.length()%6 == 0)) {
				t ="0" + t;
			}
			b += t;
		}
		
		while(!(b.length()%8 == 0)) {
			b = "0" + b;
		}
		String ans = "";
		while(b.length() > 0) {
			String t = b.substring(0, 8);
			int ind = Integer.parseInt(t, 2);
			char c = (char) ind;
			b = b.substring(8);
			ans += c+"";
		}
		System.out.println(ans);
		in.close();
	}
}
