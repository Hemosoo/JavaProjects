import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prob02 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		StringTokenizer st = new StringTokenizer(in.nextLine());
		double a = Double.parseDouble(st.nextToken());
		double b = Double.parseDouble(st.nextToken());
		double c = Double.parseDouble(st.nextToken());
		double d = b/c;
		if(d <= a) {
			System.out.println((int)a + " " + (int)b + " " + (int)c + ". I will make it!" );
		} else {
			System.out.println((int)a + " " + (int)b + " " + (int)c + ". I will be late!" );
		}
	}
}
