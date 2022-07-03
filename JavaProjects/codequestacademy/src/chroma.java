import java.util.*;
import java.io.*;
public class chroma {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i < n; i++) {
			int c[] = new int[3];
			int f[] = new int[3];
			int b[] = new int[3];
			double t = 0;
			double ans = 0;
			for(int j = 0; j < 3; j++) {
				c[j] = in.nextInt();
			}
			t = in.nextDouble();
			for(int j = 0; j < 3; j++) {
				f[j] = in.nextInt();
			}
			for(int j = 0; j < 3; j++) {
				b[j] = in.nextInt();
			}
			ans = Math.sqrt(Math.pow(c[0]-f[0], 2) + Math.pow(c[1]-f[1], 2) + Math.pow(c[2]-f[2], 2));
			if(ans <= t) {
				System.out.println(b[0] + " " + b[1] + " " + b[2]);
			} else {
				System.out.println(f[0] + " " + f[1] + " " + f[2]);
			}
		}
	}
}
