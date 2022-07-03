import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob03 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		double ans = a * a * 3.14159 * 0.75;
		double ans2 = Math.round(ans*100)/100d;
		System.out.println(Double.toString(ans2));
	}
}