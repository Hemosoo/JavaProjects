import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class prob10 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(new File("input.txt"));
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			int ans = 0;
			for(int j = (int) Math.sqrt(a); j <= b + ((int) Math.sqrt(a))-1; j++) {
				if(j == (int) Math.sqrt(a)) {
					ans += 4* j + a;
				} else {
					ans += 4* j + Math.pow(j, 2) - Math.pow(j-1, 2); 
				}
			}
			System.out.println(ans + " liters");
		}
	}
}