import java.util.*;
import java.io.*;
public class prob24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String bin = "";
		for(int i = 0; i < s1.length(); i++) {
			int ind = s2.indexOf(s1.charAt(i))-8;
			String temp = Integer.toBinaryString(ind);
			while(!(temp.length()%6 == 0)) {
				temp ="0"+temp;
			}
			bin+=temp;
		}
		
		while(!(bin.length()%8 == 0)) {
			bin ="0"+bin;
		}
		String ans = "";
		while(bin.length()>0) {
			String temp = bin.substring(0, 8);
			int ind = Integer.parseInt(temp, 2);
			char c = (char) ind;
			bin = bin.substring(8);
			ans+=c+"";
		}
		System.out.println(ans);
	}
}
