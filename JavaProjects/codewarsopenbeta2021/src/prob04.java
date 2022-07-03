import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob04 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(true) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			if(a == 0 && b == 0) break;
			double ans = Math.round(a*b *10)/10d;
			System.out.println(ans);
		}
		
		
	}
}