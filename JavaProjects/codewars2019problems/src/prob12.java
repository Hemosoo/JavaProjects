import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob12 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		int dec  = in.nextInt();
		int sign = 1;
		double pi = 3;
		for(double i = 2; i < n*2; i+=2) {
			if(sign == 1) {
				pi += (4/(i*(i+1)*(i+2)));
			} else {
				pi -= ((4/(i)*(i+1)*(i+2)));
			}
			sign *= -1;
		}
		//System.out.println(pi);
		String s = Double.toString(pi);
		char[] c = s.toCharArray();
		int count = 0;
		for(int i = 0; i < c.length; i++) {
			if(count > 0) {
				count++;
			}
			if(count == dec+1) {
				System.out.println(c[i]);
				break;
			}
			if(c[i] =='.') {
				count++;
			}
		}
	}
}