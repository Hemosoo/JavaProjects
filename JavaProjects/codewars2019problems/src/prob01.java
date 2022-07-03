import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob01 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		System.out.println("While we seem to disagree on this issue, " + in.nextLine()+  ", I respect your opinion and look forward to further discussion!");
	}
}
