import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob03 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNext()) {
			String s = in.next();
			if(s.equals("0")) break;
			boolean ans = true;
			for(int i = 1; i < s.length(); i++) {
				String temp = "";
				temp += s.substring(0, i) + "+" + s.substring(i, s.length());
				if(!check(temp.split("\\+"))) {
					ans = false;
				} 
			}
			if(ans) {
				System.out.println(s + "  MAGNANIMOUS");
			} else {
				System.out.println(s + "  PETTY");
			}
			
		}
	}
	static boolean check(String[] s) {
		int ans = 0;
		for(int i = 0; i < 2; i++) {
			ans += Integer.parseInt(s[i]);
		}
		//System.out.println(ans);
		if(ans == 1) return false;
		for(int i = 2; i < ans/2; i++) {
			if(ans % i == 0) {
				return false;
			}
		}
		return true;
	}
}