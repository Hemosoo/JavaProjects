import java.util.*;


import java.io.*;
public class prob05 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> ans = new ArrayList<String>();
		HashMap<String, Integer> check = new HashMap<String, Integer>();
		for(int i = 0; i < n; i++) {
			String l = in.nextLine();
			String p = l.substring(0, 5);
			a.add(p);
			if(check.containsKey(p)) {
				check.replace(p, check.get(p)+1);
			} else {
				check.put(p, 1);
			}
		}
		int c = 0;
		
		for(String i: check.keySet()) {
			if(check.get(i) > 1) {
				c++;

			}
		}
		for(int i = 0; i < a.size(); i++) {
			if(check.get(a.get(i)) != 1 && !ans.contains(a.get(i))) {
				ans.add(a.get(i));
			}
		}
		if(c == 0) {
			System.out.println("0");
			System.out.println("duplicates: None");
		} else {
			String s = "";
			for(String i: ans) {
				s += i + " ";
			}
			System.out.println(c);
			System.out.println("duplicates: " + s);
		}
		
	}
}
