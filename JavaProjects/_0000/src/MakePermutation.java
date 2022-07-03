import java.util.*;
public class MakePermutation {
	static ArrayList<String> p;
	public static void main(String[] args) {
		p = new ArrayList<String>();
		per("123455", "");
		for(String s: p) {
			System.out.println(s);
		}
		System.out.println(p.size());
		
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
