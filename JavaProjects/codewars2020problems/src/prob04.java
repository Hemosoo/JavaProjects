import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob04 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int a = in.nextInt();
		int b = in.nextInt();
		int x = a;
		int y = b;
		while(true) {
			if(a == b) {
				System.out.println(a);
				break;
			} else if(a > b) {
				b += y;
			} else {
				a += x;
			}
		}
	}
}