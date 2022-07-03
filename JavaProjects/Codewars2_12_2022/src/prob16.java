import java.util.*;
import java.io.*;
public class prob16 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		
		ArrayList[] a = new ArrayList[n];
		for(int i = 0; i < n; i++) {
			a[i] = new ArrayList<String>();
			String s = in.nextLine();
			for(String s1: s.split(" ")) {
				a[i].add(s1);
			}
		}
		int n2 = in.nextInt();
		in.nextLine();
		for(int i = 0; i < n2; i++) {
			ArrayList<Integer> ind = new ArrayList<Integer>();
			String s = in.next();
			for(int j = 0; j < s.length(); j++) {
				for(int k = 0; k < n; k++) {
					if((!ind.contains(k)) && a[k].contains(s.charAt(j) +"")) {
						ind.add(k);
						break;
					}
				}
			}
			if(ind.size() == s.length()) {
				System.out.println(s + " can be formed");
			} else System.out.println(s + " CANNOT be formed");
		}
	}
}
