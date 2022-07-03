import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob06 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		in.nextLine();
		String s = in.nextLine();
		//System.out.println(n);
		//System.out.println(s);
		String ans = "";
		for(int i = 0; i < n; i++) {
			int ascii = s.charAt(i);
			//System.out.println((char)ascii);
			if(ascii > 90 || ascii < 65) {
				ans += s.charAt(i) + "";
			} else {
				ascii-=5;
				if(ascii < 65) {
					int temp = 65 - ascii;
					ascii = 90-temp + 1;
				}
				ans += (char)ascii + "";
			}
		}
		System.out.println(ans);
	}
}