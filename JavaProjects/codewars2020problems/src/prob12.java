import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prob12 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		while(in.hasNextLine()) {
			String s = in.nextLine();
			String[] a = s.split(" ");
			if(a.length == 3) {
				int x = Integer.parseInt(a[0]);
				int y = Integer.parseInt(a[1]);
				int z = Integer.parseInt(a[2]);
				double ans = x*3*0.3048*100 + y*0.3048*100 + z * 2.54;
				System.out.println(String.format("%.2f", Math.round(ans*100)/100d));
			} else if(a.length == 2) {
				int x = Integer.parseInt(a[0]);
				int y = Integer.parseInt(a[1]);
				double ans = x*3*0.3048*100 + y*0.3048*100;
				System.out.println(String.format("%.2f", Math.round(ans*100)/100d));
			} else {
				int x = Integer.parseInt(a[0]);
				double ans = x*3*0.3048*100;
				System.out.println(String.format("%.2f", Math.round(ans*100)/100d));
			}
		}
	}
}