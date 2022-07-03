import java.util.*;
import java.io.*;
public class prob20 {
	static ArrayList<String> p;
	public static void main(String[] args) {
		p = new ArrayList<String>();
		ArrayList<String> lines = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		lines.add(in.next());
		lines.add(in.next());
		lines.add(in.next());
		lines.add(in.next());
		//System.out.println(l1);
		for(String s:lines) {
			for(int i = 0; i < s.length(); i++) {
				
			}
		}
		
	}
	static void per(String left, String right) {
		
		if(left.length() == 0) {
			p.add(right);
			return;
		}
		for(int i = 0; i < left.length(); i++) {
			char c = left.charAt(i);
			String l = left.substring(0, i)+left.substring(i+1);
			String r = right + c;
			per(l, r);
		}
	}
}
