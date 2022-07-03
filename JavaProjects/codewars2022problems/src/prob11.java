import java.util.*;
import java.io.*;
public class prob11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> punc = new ArrayList<String>();
		punc.add(",");
		punc.add("!");
		punc.add(".");
		punc.add("?");
		while(true) {
			String line = in.nextLine();
			if(line.equals("END")) return;
			String[] s = line.split(" ");
			String ans = "";
			for(int i = 0; i < s.length; i++) {
				String t = s[i];
				int len = 0;
				for(char c: t.toCharArray()) {
					if(!punc.contains(c+"")) {
						len++;
					}
				}
				
				if(t.toLowerCase().charAt(0) == 'a' || t.toLowerCase().charAt(0) == 'e' || t.toLowerCase().charAt(0) == 'i' || t.toLowerCase().charAt(0) == 'o'|| t.toLowerCase().charAt(0) == 'u') {
					if(punc.contains(t.charAt(t.length()-1)+"")) {
						ans += t.substring(0,t.length()-1)+"-m" + t.charAt(t.length()-1);
					} else {
						ans += t+"-m";
					}
					
					
				} else if(len == 2) {
					ans += t;
				} else {
					if(punc.contains(t.charAt(t.length()-1)+"")) {
						ans += t.substring(1, t.length()-1) + t.charAt(0) +  "-squeak" + t.substring(t.length()-1);
					} else {
						ans += t.substring(1, t.length()) + t.charAt(0) + "-squeak";
					}
				}
				ans += " ";
			}
			System.out.println(ans);
		}
	}
}
