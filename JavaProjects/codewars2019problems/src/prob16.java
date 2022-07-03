import java.util.*;
import java.io.*;
public class prob16 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String l = in.nextLine();
		String[] w = l.split(" ");
		String prev = w[0];
		ArrayList<String> sent = new ArrayList<String>();
		boolean found = false;
		for(int i = 1; i < w.length; i++) {
			if(prev.toLowerCase().equals("had") || prev.toLowerCase().equals("is")) {
				if(found) {
					prev = w[i];
					continue;
				}
				sent.add(w[i]);
				found = true;
			} else if(prev.toLowerCase().equals(w[i].toLowerCase())) {
				//System.out.println("here");
				found = false;
				continue;
			} else {
				found = false;
				sent.add(w[i]);
			}
			
			prev = w[i];
		}
		String ans = w[0] + " ";
		for(String s: sent) {
			ans+=s + " ";
		}
		System.out.println(ans.substring(0, ans.length()-1));
 	}
}
