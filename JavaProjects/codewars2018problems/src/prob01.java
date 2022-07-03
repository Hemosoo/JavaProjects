import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob01 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		System.out.println("Salutations, " + in.next() + "! We are the Fighting Sandcrabs from Port Lavaca HS!");
	}
}