import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob06 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int a = in.nextInt()*2;
		System.out.println((a * (a-2))/2);
	}
}