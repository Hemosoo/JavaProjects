import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob04 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			double a = in.nextDouble()/100;
			double b = in.nextDouble();
			//System.out.println(a/100);

			double ans = b - (b/(a+1));
			String a1 = String.format("%.2f", b);
			String a2 = String.format("%.2f", ans);
			System.out.println("On your $" + a1 + " purchase, the tax amount was $" + a2);
		}
	}
}