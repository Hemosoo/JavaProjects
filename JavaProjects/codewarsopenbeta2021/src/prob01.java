import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob01 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		String s = in.next();
		System.out.println(s + ", the needs of the many outweigh the needs of the few, or the one; live long and prosper.");
	}
}