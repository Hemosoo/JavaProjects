import java.util.*;
import java.io.*;
public class prob06 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine(); 
		String text = in.nextLine();
		String ans = "";
		char[] pl = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		char[] ci = "FGHIJKLMNOPQRSTUVWXYZABCDE".toCharArray();
		for(int i = 0; i < n; i++) {
			char c = text.charAt(i);
			boolean added = false;
			for(int j = 0; j < ci.length; j++) {
				if(c == ci[j]) {
					ans+=pl[j] + "";
					added = true;
				}
			}
			if(!added) {
				ans+=c+"";
			}
		}
		System.out.println(ans);
	}
}
