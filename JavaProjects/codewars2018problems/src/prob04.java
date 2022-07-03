import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob04 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int g = in.nextInt();
			int s = in.nextInt();
			int b = in.nextInt();
			while(b > 5) {
				b -= 5;
				s++;
			}
			while(s > 10) {
				s -= 10;
				g++;
			}
			System.out.println(g + " " + s + " " + b);
		}
		
	}
}