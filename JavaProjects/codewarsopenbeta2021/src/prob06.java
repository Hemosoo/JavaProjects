import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob06 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(true) {
			double a = in.nextDouble();
			if(a == 0) break;
			a = Math.pow(a, 2);
			a = Math.cbrt(a);
			System.out.println(Math.round(a*10000)/10000d);
		}
	}
}