import java.io.*;
import java.util.*;
public class prob14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i1 = in.nextInt();
		int i2 = in.nextInt();
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(i1);
		a.add(i2);
		String s = "";
		int i3 = in.nextInt();
		for(int i = 2; i < i3; i++) {
			a.add(a.get(i-2) + a.get(i-1));
		}
		for(Integer i: a) {
			s += i + ",";
		}
		System.out.println(s.substring(0, s.length()-1));
	}
}