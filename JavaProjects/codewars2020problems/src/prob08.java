import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob08 {
	public static void main(String[] args) throws IOException {
		String ans = "";
		int hold = 0;
		Scanner in = new Scanner(new File("input.txt"));
		String s2 = "";
		while(in.hasNextLine()) {
			s2+=in.nextLine() + " ";
			
		}
		String[] s = s2.split(" ");
		ans += s[0];
		hold += s[0].length();
		for(int i = 1; i < s.length; i++) {
			hold += s[i].length()+1;
			if(hold <= 80) {
				ans += " " + s[i];
			} else {
				ans += "\n" + s[i];
				hold = s[i].length();
			}
		}
		System.out.println(ans);
	}
}
