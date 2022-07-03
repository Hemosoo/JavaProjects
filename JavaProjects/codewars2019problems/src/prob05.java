import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob05 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int a = in.nextInt();
		System.out.println((a * (a + 1) * (2*a + 1))/6);
	}
}