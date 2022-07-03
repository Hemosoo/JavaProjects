import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob02 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String s = in.next();
		char c[] = s.toCharArray();
		String ans = "";
		for(int i = c.length-1; i >= 0; i--) {
			ans += c[i];
		}
		System.out.println(ans);
	}
}